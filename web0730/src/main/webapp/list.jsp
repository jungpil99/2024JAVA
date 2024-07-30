<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = "";
String title = "";
String writer = "";
String regtime = "";
String hits = "";

String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
String sql = "select * from board";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();

request.setCharacterEncoding("UTF-8");
num = request.getParameter("num");
title = request.getParameter("title");
writer = request.getParameter("writer");
regtime = request.getParameter("regtime");
hits = request.getParameter("hits");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
<body>

<table>
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="writer" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th class="hits"   >조회수  </th>
    </tr>
<%
while(rs.next()){
	num = rs.getString("num");
	writer = rs.getString("writer");
	title = rs.getString("title");
	regtime = rs.getString("regtime");
	hits = rs.getString("hits");
%>
    <tr>
        <td><%=num %></td>
        <td style="text-align:left;">
            <a href="view.jsp?num=<%=num%>"><%=title %></a>
        </td>
        <td><%=writer %></td>
        <td><%=regtime %></td>
        <td><%=hits %></td>
    </tr>
    
<%
}
%>
</table>

<br>
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">

</body>
</html>
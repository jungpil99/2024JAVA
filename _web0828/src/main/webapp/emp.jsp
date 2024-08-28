<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("deptno");

String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
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
        <th class="empno">사번 </th>
        <th class="ename">이름</th>
        <th class="job" >직급</th>
        <th class="sal">월급</th>
    </tr>
<%
String sql = "select * from emp where deptno = ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, num);
ResultSet rs = pstmt.executeQuery();

while(rs.next()){
	String empno = rs.getString("empno");
	String ename = rs.getString("ename");
	String job = rs.getString("job");
	String sal = rs.getString("sal");
%>
    <tr>
        <td><%=empno %></td>
        <td><%=ename %></td>
        <td><%=job %></td>
        <td><%=sal %></td>     
    </tr>
    
<%
}
%>
</table>


</body>
</html>
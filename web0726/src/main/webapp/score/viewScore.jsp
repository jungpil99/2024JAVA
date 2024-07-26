<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String sql = "select * from score";
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table >
<tr>
<td bgcolor="grey">번호</td>
<td bgcolor="grey">이름</td>
<td bgcolor="grey">국어</td>
<td bgcolor="grey">영어</td>
<td bgcolor="grey">수학</td>
<td bgcolor="grey">총점</td>
<td bgcolor="grey">평균</td>
</tr>
<%
while(rs.next()){
	int num = rs.getInt("num");
	String name = rs.getString("name");
	int kor = rs.getInt("kor");
	int eng = rs.getInt("eng");
	int math = rs.getInt("math");
	int sum = kor + eng + math;
	double avg = sum / 3;
%>
<tr>
<td><%=num %></td> 
<td><%=name %></td> 
<td><%=kor %></td> 
<td><%=eng %></td> 
<td><%=math %></td> 
<td><%=sum %></td>
<td><%=avg %></td>
</tr>
<%
}
%>
</table>
</body>
</html>
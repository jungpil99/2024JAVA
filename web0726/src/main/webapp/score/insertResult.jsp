<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int num = Integer.parseInt(request.getParameter("num"));
String name = request.getParameter("name");
int kor = Integer.parseInt(request.getParameter("kor"));
int eng = Integer.parseInt(request.getParameter("eng"));
int math = Integer.parseInt(request.getParameter("math"));

String sql = "insert into score (num, name, kor, eng, math) values (?, ?, ?, ?, ?)";

String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
pstmt = conn.prepareStatement(sql);

pstmt.setInt(1, num);
pstmt.setString(2, name);
pstmt.setInt(3, kor);
pstmt.setInt(4, eng);
pstmt.setInt(5, math);

int ret = pstmt.executeUpdate();
out.println("등록 완료");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
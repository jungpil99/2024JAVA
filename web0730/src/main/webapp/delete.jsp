<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
String sql = "delete from board where num = ?";
pstmt = conn.prepareStatement(sql);

request.setCharacterEncoding("UTF-8");
num = request.getParameter("num");
title = request.getParameter("title");
writer = request.getParameter("writer");
regtime = request.getParameter("regtime");
hits = request.getParameter("hits");

pstmt.setString(1, num);
int ret = pstmt.executeUpdate();

response.sendRedirect("list.jsp");
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
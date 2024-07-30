<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = "";
String title = "";
String writer = "";
String content = "";
String sql = "";
String regtime = "";

LocalDateTime now = LocalDateTime.now();

String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

sql = "update board set title = ? , writer = ?, content = ?, regtime =? where num = ?";
pstmt = conn.prepareStatement(sql);

request.setCharacterEncoding("UTF-8");
num = request.getParameter("num");
title = request.getParameter("title");
writer = request.getParameter("writer");
content = request.getParameter("content");
regtime = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(now);

pstmt.setString(1, writer);
pstmt.setString(2, title);
pstmt.setString(3, content);
pstmt.setString(4, regtime);
pstmt.setString(5, num);

int ret = pstmt.executeUpdate();
response.sendRedirect("list.jsp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
</body>
</html>
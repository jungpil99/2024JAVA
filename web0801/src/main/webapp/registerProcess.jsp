<%@page import="account.AccountDTO"%>
<%@page import="account.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
AccountDAO dao = new AccountDAO();

request.setCharacterEncoding("UTF-8");
String username = request.getParameter("username");
String password = request.getParameter("password");
String tel = request.getParameter("tel");

AccountDTO dto = new AccountDTO(0, username, password, tel, 0);
dao.insertAccount(dto);

response.sendRedirect("index.jsp");
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
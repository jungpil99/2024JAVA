<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookies cookies = new Cookies(request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
if(cookies.exists("email")){
%>
이메일은 "<%= cookies.getValue("email") %>"
<%
}else{
%>
이메일 저장 못함
<%
}
%>
</body>
</html>
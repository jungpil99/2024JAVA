<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email = "";
boolean rememberMe = false;
Cookies cookies = new Cookies(request);
if(cookies.exists("email")){
	email = cookies.getValue("email");
	rememberMe = true;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="saveEmailResult.jsp" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%=email %>" required><br>
        <input type="checkbox" id="rememberMe" name="rememberMe" <%= rememberMe ? "checked" : "" %>>
        <label for="rememberMe">Remeber Me</label> <br>
        <input type="submit" value="submit">
</form>
</body>
</html>
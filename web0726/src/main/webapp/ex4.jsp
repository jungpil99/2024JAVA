<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String text = request.getParameter("text");
int count = Integer.parseInt(request.getParameter("count"));
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int i = 0;
while (i < count){
%>
    <h1><%=text %></h1>
    
<% 
 i++;
}
%>
</body>
</html>
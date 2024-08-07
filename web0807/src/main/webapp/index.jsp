<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.setAttribute("vv", "해빔소");
String ss = (String)session.getAttribute("vv");
request.setAttribute("kk", "고순조");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${1+100 }<br>
${vv =='황새치'}<br>
${vv}
<br>
<%=ss %>
<br>
${kk}
</body>
</html>
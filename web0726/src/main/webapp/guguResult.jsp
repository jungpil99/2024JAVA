<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
int n = Integer.parseInt(request.getParameter("gugu"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=n %>단</title>
</head>
<body>
<table border="1">
<tr>
<th><%=n %>단</th>
</tr>
<%
for (int i = 1; i <= 9; i++){
%>
     <tr><td><%=n %>x<%=i %>=<%=i*n %></td></tr>
<%
}
%>
</table>
</body>
</html>
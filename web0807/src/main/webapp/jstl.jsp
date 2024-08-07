<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setAttribute("name", "고순조");
request.setAttribute("money", 5000);
request.setAttribute("dataList", new String[] {"a","b","c"});
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSTL if -->
<c:if test="${name == '고순조'}">
이름은 고순조 입니다<br>
</c:if>
<c:choose>
<c:when test="${money >= 10000}"> 돈 많다 </c:when>
<c:when test="${money > 0}">돈 조금 있다</c:when>
<c:otherwise>돈 없다</c:otherwise>
</c:choose>
<br><br>
<c:forEach var="count" begin="0" end="30" step="3">
${count}
</c:forEach>
<br>
${sum = 0}
<br>
<c:forEach var="j" begin="0" end="10" step="1">
${sum = sum + j}
</c:forEach>
1부터 10까지의 합 : ${sum}
<ul>
<c:forEach var="i" begin="1" end="9">
<li>4 x ${i} = ${4*i}
</c:forEach>
</ul>
<c:forEach var="data" items="${dataList}">
${data}
</c:forEach>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="Post" action="empJsonserver1.jsp" accept-charset="UTF-8">
    <input type="hidden" name="action" value="create">
<input type="text" name="ename" placeholder="사원명"><br>
<input type="text" name="job" placeholder="직급"><br>
<input type="text" name="mgr" placeholder="MGR"><br>
<input type="text" name="hiredate" placeholder="입사일"><br>
<input type="text" name="sal" placeholder="월급"><br>
<input type="text" name="comm" placeholder="보너스"><br>
<input type="text" name="deptno" placeholder="부서번호"><br>
<input type="submit" value="제출">
</form>
</body>
</html>
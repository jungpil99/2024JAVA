<%@page import="member.MemberDTO"%>
<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   

<%
MemberDAO dao = new MemberDAO();

request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");

MemberDTO dto = dao.getlogin(id, pw);

if(dto != null){
	 session.setAttribute("userId",   dto.getId());
     session.setAttribute("userName", dto.getName());
     response.sendRedirect("login_main.jsp");   
}else{
	out.println("<script type='text/javascript'>");
    out.println("alert('로그인 실패')");
    out.println("history.back();");
    out.println("</script>");
}

%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
</body>
</html>

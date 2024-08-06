<%@page import="member.MemberDTO"%>
<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
MemberDAO dao = new MemberDAO();


String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");

MemberDTO dto = dao.joinMember(id, pw, name);

boolean join = false;
if(id == null){
	join = true;
}

if(join == true){
	 out.println("<script type='text/javascript'>");
     out.println("alert('회원가입 성공')");
     out.println("window.close();");
     out.println("</script>");
}else{
	out.println("<script type='text/javascript'>");
    out.println("alert('회원가입 실패')");
    out.println("history.back();");
    out.println("</script>");
}

%>

</body>
</html>
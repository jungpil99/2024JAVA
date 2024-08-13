<%@page import="webhard.WebHard"%>
<%@page import="webhard.WebHardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.File" %>
    
<% 
    int num = Integer.parseInt(request.getParameter("num"));
    WebHardDAO dao = new WebHardDAO();
    WebHard webHard = dao.getWebHardByNum(num);
    if(webHard != null){
    	File file = new File(application.getRealPath("/files/") +
                webHard.getFname());
        if (file != null) {
             file.delete();
        }
        dao.deleteWebHard(num);
    }
    
    response.sendRedirect("webhard.jsp");
%>
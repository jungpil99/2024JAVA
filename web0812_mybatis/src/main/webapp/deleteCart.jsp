<%@page import="shop.CartProducts"%>
<%@page import="shop.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");

CartDAO dao = new CartDAO();
dao.deleteCart(Integer.parseInt(id));
%>
<jsp:forward page="justViewCart.jsp"/>

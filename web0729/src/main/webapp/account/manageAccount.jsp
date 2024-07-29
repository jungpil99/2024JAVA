<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

String idTmp = "";
String nameTmp = "";
String ssnTmp = "";
String telTmp = "";
String balTmp = "";
String sql = "";

request.setCharacterEncoding("UTF-8"); 
String deposit = request.getParameter("deposit");
String delete = request.getParameter("delete");
String find = request.getParameter("find");
String id = request.getParameter("id");
String name = request.getParameter("name");
String ssn = request.getParameter("ssn");
String tel = request.getParameter("tel");
String bal = request.getParameter("balance");

if(delete != null){
	sql = "delete from account where id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, delete);
	int ret = pstmt.executeUpdate();
}

if(find != null){
	sql = "select * from account where id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, find);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()){
		idTmp = rs.getString("id");
		nameTmp = rs.getString("name");
		ssnTmp = rs.getString("ssn");
		telTmp = rs.getString("tel");
		balTmp = rs.getString("balance");
	}
}

if(id != null){
	sql = "select count(*) from account where id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int count = rs.getInt(1);
	if(count == 1){
		sql = "update account set name = ?, ssn = ?, tel = ?, balance = ? where id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, ssn);
		pstmt.setString(3, tel);
		pstmt.setString(4, bal);
		pstmt.setString(5, id);
		int ret = pstmt.executeUpdate();
	}else {
		sql = "insert into account(id, name, ssn, tel, balance) values (?, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, ssn);
		pstmt.setString(4, tel);
		pstmt.setString(5, bal);
		int ret = pstmt.executeUpdate();
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
        table { width: 800px; text-align: left; }
        th    { width: 40px; background-color: green; }
    </style>
<title>Insert title here</title>
</head>
<body>
<form>
아이디 : <input type = "text" name = "id" value="<%=idTmp %>"><br>
이름 : <input type = "text" name = "name" value="<%=nameTmp %>"><br>
비밀번호 : <input type = "text" name = "ssn" value="<%=ssnTmp %>"><br>
전화번호 : <input type = "text" name = "tel" value="<%=telTmp %>"><br>
금액 : <input type="text" name = "balance" value="<%=balTmp %>"> <br>
<input type="submit" value="입력/수정">
</form>
<table>
<tr>
        <th>아이디</th>
        <th>이름</th>
        <th>비밀번호</th>
        <th>전화번호</th>
        <th>잔고</th>
        <th></th>
</tr>
<%
sql = "select * from account";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();

while(rs.next()){
	idTmp = rs.getString("id");
	nameTmp = rs.getString("name");
	ssnTmp = rs.getString("ssn");
	telTmp = rs.getString("tel");
	balTmp = rs.getString("balance");
%>
    <tr>
    <td><a href="?find=<%=idTmp %>"><%=idTmp %></a></td>
    <td><%=nameTmp %></td>
    <td><%=ssnTmp %></td>
    <td><%=telTmp %></td>
    <td><%=balTmp %></td>
    <td><button onclick="location.href='?delete=<%=idTmp%>'">삭제</button></td>
    </tr>
<%
}
%>

</table>
</body>
</html>
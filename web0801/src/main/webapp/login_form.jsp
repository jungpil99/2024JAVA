<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="favicon.ico" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/ie.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .login-container h2 {
            margin-bottom: 20px;
        }
        .login-container input {
            width: 95%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .login-container button {
            width: 100%;
            padding: 10px;
            background-color: #333;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
     <header>
        <div class="inner">
            <h1><a href="index.jsp">DCODLAB</a></h1>

            <ul id="gnb">
                <li><a href="#">DEPARTMENT</a></li>
                <li><a href="#">GALLERY</a></li>
                <li><a href="#">YOUTUBE</a></li>
                <li><a href="community_form.jsp">커뮤니티</a></li>
                <li><a href="#">고객센터</a></li>
            </ul>

            <ul class="util">
                <%
                if((String)session.getAttribute("userName") != null){
                %>
                <li><a href="#"><%=(String)session.getAttribute("userName") %>님</a></li>
                <li><a href="logout.jsp">logout</a></li>
                <%
                }else{
                %>
                <li><a href="login_form.jsp">Login</a></li>
                <li><a href="join_form.jsp">Join</a></li>
                <%
                }
                %>
            </ul>
        </div>
    </header>
    <div class="login-container">
        <h2>로그인</h2>
        <form action="loginProcess.jsp" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">로그인</button>
        </form>
    </div>
</body>
</html>
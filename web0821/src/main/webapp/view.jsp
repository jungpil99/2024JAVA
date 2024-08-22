<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/08/css/style.css">
    <script src="${pageContext.request.contextPath}/08/js/ie.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
        <div class="container-fluid">
          <a class="navbar-brand" href="${pageContext.request.contextPath}/home">Navbar</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <c:if test="${userLoggedIn}">
					<li class="nav-item">
                      <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/infoform">${customInfo.name}님</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/logout">logout</a>
                    </li>
				</c:if>
				<c:if test="${!userLoggedIn}">
					<li class="nav-item">
                      <a class="nav-link" aria-current="page" href="${pageContext.request.contextPath}/loginform">Login</a>
                    </li>
					<li class="nav-item">
                      <a class="nav-link" href="${pageContext.request.contextPath}/joinform">Join</a>
                   </li>
				</c:if>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="${pageContext.request.contextPath}/list">커뮤니티</a></li>
                  <li><a class="dropdown-item" href="${pageContext.request.contextPath}/">자료실</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<div class="container" style="padding-top: 50px;">
<table class="table table-bordered table-hover">
    <tbody>
    <tr>
        <th scope="col">제목</th>
        <td>${msg.title}</td>
    </tr>
    <tr>
        <th scope="col">작성자</th>
        <td>${msg.writer}</td>
    </tr>
    <tr>
        <th scope="col">작성일시</th>
        <td>${msg.regtime}</td>
    </tr>
    <tr>
        <th scope="col">조회수</th>
        <td>${msg.hits}</td>
    </tr>
    <tr>
        <th scope="col">내용</th>
        <td>${msg.content}</td>
    </tr>
    </tbody>
</table>

<br>
<input type="button" class="btn btn-outline-primary" value="목록보기" onclick="location.href='list'">
<c:if test="${update}">
<input type="button" class="btn btn-outline-primary" value="수정"
       onclick="location.href='write?num=${param.num}'">
<input type="button" class="btn btn-outline-primary" value="삭제"
       onclick="location.href='delete?num=${param.num}'">
</c:if>
<c:if test="${!update}">
<input type="button" class="btn btn-outline-primary" value="수정"
       onclick="location.href='error'">
<input type="button" class="btn btn-outline-primary" value="삭제"
       onclick="location.href='error'">
</c:if>
</div>
<footer>
        <div class="inner">
            <div class="upper">
                <h1>DCODELAB</h1>
                <ul>
                    <li><a href="#">Policy</a></li>
                    <li><a href="#">Terms</a></li>
                    <li><a href="#">Family Site</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas, facere.<br>
                    TEL : 031-111-1234 C.P : 010-1234-5678
                </address>
                <p>
                    2020 DOCDELAB &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
</body>
</html>
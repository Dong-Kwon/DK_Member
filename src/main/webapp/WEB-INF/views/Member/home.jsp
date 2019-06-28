<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<title>Index</title>
</head>
<body>
	<c:choose>
		<c:when test="${id!=null }">
			${id }님 환영합니다~! <br>
			<input id="board" type="button" value="게시판으로">
			<input id="myPage" type="button" value="마이페이지">
			<input id="logOut" type="button" value="로그아웃">
		</c:when>
		<c:otherwise>
			<input id="id" name="id" type="text" placeholder="아이디를 입력하세요"><br>
			<input id="pw" name="pw" type="password" placeholder="비밀번호를 입력하세요"><br>
			<button id="login">로그인</button>
			<button id="sign">회원가입</button>
		</c:otherwise>
	</c:choose>
	<script>
		$("#sign").on("click", function(){
			$(location).attr("href", "signForm.mb");
		})
		$("#login").on("click", function(){
			$(location).attr("href", "loginForm.mb?id=" + $("#id").val() + "&pw=" + $("#pw").val(), "width=300px, height=300px");
		})
		$("#myPage").on("click", function(){
			$(location).attr("href", "myPageForm.mb");
		})
		$("#logOut").on("click", function(){
			location.href="logOut.mb";
		})
		$("#board").on("click", function(){
			$(location).attr("href", "board.bd");
		})
	</script>
</body>
</html>
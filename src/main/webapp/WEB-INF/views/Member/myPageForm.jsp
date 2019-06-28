<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>myPageForm</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>
	<table border=1px solid black>
		<tr>
			<td colspan=2 align=center>마이 페이지
		<tr>
			<td>프로필 사진
			<td><a href="a.png"><img src=${dto.imgAddr } border="0"></a>
		<tr>
			<td>아이디
			<td><input id="id" type=Text name="id" value= ${id }>
		<tr>
			<td>변경할 비밀번호
			<td><input id="pw1" type=password>
		<tr>
			<td>비밀번호 확인
			<td><input id="pw" type=password name="pw">
		<tr>
			<td>이름
			<td><input id="name" type=text name="name" value=${dto.name }>
		<tr>
			<td colspan=2 align=center><input id="back" type=submit value="돌아가기">
	</table>
	<script>
		$("#back").on("click",function(){
			location.href="/.mb";
		})
	</script>
</body>
</html>
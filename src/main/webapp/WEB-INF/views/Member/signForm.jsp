<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<title>signinForm</title>
</head>
<body>
	<form action="signProc.mb" method="post" enctype="multipart/form-data">
		<table border=1px solid black>
			<tr>
				<td colspan=2 align=center>회원가입 입력란
			<tr>
				<td>프로필 사진
				<td><input type=file name=image>
			<tr>
				<td>아이디
				<td><input id="id" type=Text name="id"><span id="duplProc"></span>
			<tr>
				<td>비밀번호
				<td><input id="pw1" type=password>
			<tr>
				<td>비밀번호 확인
				<td><input id="pw" type=password name="pw">
			<tr>
				<td>이름
				<td><input id="name" type=text name="name">
			<tr>
				<td colspan=2 align=center><input type=submit value="가입하기">
		</table>
	</form>
	<script>
		$("#id").on("input",function(){
			$.ajax({
				url:"ajax.mb",
				data: {
					id : $("#id").val()
				}
			}).done(function(resp){
				$("#duplProc").text(resp);
			})
		})
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<style>
	#write {
		margin-left:3px;
		text-align: center;
		border: 1px solid black;
		width:98%;
	}

	#wrapper {
		padding-top: 1px;
		border: 1px solid black;
		box-sizing: border-box;
		width: 500px;
		height: 400px;
	}

	#contents {
		width: 100%;
	}

	#left {
		float: left;
		width: 15%;
	}

	#left>* {
		float: left;
		width: 100%;
		text-align: center;
	}

	#name {
		line-height: 25px;
	}

	#writer {
		line-height: 25px;
	}

	#content {
		height: 308px;
		padding-top: 150px;
	}

	#right {
		float: left;
		width: 85%;
	}

	input {
		width: 99%;
	}

	#rwriter {
		padding:3px;
		line-height: 25px;
		text-align: center;
	}

	#rname {
		padding:3px;
		line-height: 25px;
		margin-bottom: 10px
	}

	#textarea {
		padding-left:3px;
		height: 300px;
		width:97.5%;
	}
</style>
</head>
<body>
<form action=write.bd>
	<div id=wrapper>
		<div id=write>글쓰기</div>
		<div id=contents border>
			<div id=left>
				<div id=writer>작성자</div>
				<div id=name>제목</div>
				<div id=content>내용</div>
			</div>
			<div id=right>
				<div id=rwriter>
					<input type=text>
				</div>
				<div id=rname>
					<input type=text>
				</div>
				<div id=rcontent>
					<input id=textarea type=textarea>
				</div>
			</div>
		</div>
	</div>
</form>
</body>
</html>
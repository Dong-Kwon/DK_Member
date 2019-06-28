<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>
					게시판
	<table id=table border 1 align=center>
		<tr>
			<td>No</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성시간</td>
			<td>조회수</td>
			<td>좋아요</td>
		</tr>
	</table>
	<input id=write type=button value="글쓰기" align=right>
	<script>
		$("#write").on("click", function(){
			$(location).attr("href", "writeForm.bd");
		})
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/B_board/B_add" method="post">
제목 : <input type="text" name="title"><br>
작성자 : Max <br>
카테고리
<select name="category">
	<option value="1">메이플1</option>
	<option value="2">메이플2</option>
	<option value="3">메이플3</option>
	<option value="4">메이플4</option>	
</select> 
내용 <textarea rows="10" cols="30" name="content"></textarea><br>
이미지 등록<input type="file" name="file"><br>
<input type="submit" value="등록">
<input type="reset" value="취소">
</form>

</body>
</html>
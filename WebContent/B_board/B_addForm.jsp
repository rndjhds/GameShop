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
���� : <input type="text" name="title"><br>
�ۼ��� : Max <br>
ī�װ�
<select name="category">
	<option value="1">������1</option>
	<option value="2">������2</option>
	<option value="3">������3</option>
	<option value="4">������4</option>	
</select> 
���� <textarea rows="10" cols="30" name="content"></textarea><br>
�̹��� ���<input type="file" name="file"><br>
<input type="submit" value="���">
<input type="reset" value="���">
</form>

</body>
</html>
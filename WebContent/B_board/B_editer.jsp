<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form name = "p" action="${pageContext.request.contextPath}/B_board/b_edit" method="post"
enctype="multipart/form-data">
<input type="hidden" name = "seq" value="${p.seq }">
<table border = "1">
<tr>
<th>글번호</th>
<td>${p.seq }</td>
</tr>

<tr>
<th>글 제목</th>
<td><input type="text" name="title" value="${p.title }"></td>
</tr>

<tr>
<th>작성자</th>
<td></td>
</tr>

<tr>
<th>카테고리</th>
<td>
<select name="category" value = "${p.category }">
<option value="1">메이플1</option>
<option value="2">메이플2</option>
<option value="3">메이플3</option>
<option value="4">메이플4</option>
</select>
</td>
</tr>

<tr>
<th>글 내용</th>
<td>
<textarea rows="10" cols="30" name="content" value = "${p.content }"></textarea>
</td>
</tr>

<tr>
<th>이미지등록</th>
<td><input type="file" name="file" value="${p.url }"><br></td>
</tr>
</table>
<input type="submit" value="등록" onclick="b()">
<input type="reset" value="취소" onclick = "history.back(-1)">

</form>
</body>
</html>
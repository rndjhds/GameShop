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
<th>�۹�ȣ</th>
<td>${p.seq }</td>
</tr>

<tr>
<th>�� ����</th>
<td><input type="text" name="title" value="${p.title }"></td>
</tr>

<tr>
<th>�ۼ���</th>
<td></td>
</tr>

<tr>
<th>ī�װ�</th>
<td>
<select name="category" value = "${p.category }">
<option value="1">������1</option>
<option value="2">������2</option>
<option value="3">������3</option>
<option value="4">������4</option>
</select>
</td>
</tr>

<tr>
<th>�� ����</th>
<td>
<textarea rows="10" cols="30" name="content" value = "${p.content }"></textarea>
</td>
</tr>

<tr>
<th>�̹������</th>
<td><input type="file" name="file" value="${p.url }"><br></td>
</tr>
</table>
<input type="submit" value="���" onclick="b()">
<input type="reset" value="���" onclick = "history.back(-1)">

</form>
</body>
</html>
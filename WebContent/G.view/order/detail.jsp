<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form name="f" action="${pageContext.request.contextPath }/seller/Edit" method="post">
	<input type="hidden" name="img" value="${g.img}"> 
	<table border="1">
	<tr>
		<th>��ǰ��ȣ</th>
		<td>"${g.seq }"</td>
	</tr>
	<tr>
		<th>��ǰ��</th>
		<td>"${g.product_name }"</td>
	</tr>

	<tr>
		<th>�ۼ���</th>
		<td>"${g.register }"</td>
	</tr>
	<tr>
		<th>����</th>
		<td>"${g.price }"</td>
	</tr>
	<tr>
		<th>��ǰ �̹���</th>
		<td><br><img src="${g.img }" width="300" height="300"/></td>
	</tr>
	<tr>
		<th>��ǰ ����</th>
		<td>"${g.content }" </td>
	</tr>
	</table>
	</form>


</body>
</html>
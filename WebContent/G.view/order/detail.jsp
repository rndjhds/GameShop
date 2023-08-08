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
		<th>상품번호</th>
		<td>"${g.seq }"</td>
	</tr>
	<tr>
		<th>상품명</th>
		<td>"${g.product_name }"</td>
	</tr>

	<tr>
		<th>작성자</th>
		<td>"${g.register }"</td>
	</tr>
	<tr>
		<th>가격</th>
		<td>"${g.price }"</td>
	</tr>
	<tr>
		<th>상품 이미지</th>
		<td><br><img src="${g.img }" width="300" height="300"/></td>
	</tr>
	<tr>
		<th>상품 설명</th>
		<td>"${g.content }" </td>
	</tr>
	</table>
	</form>


</body>
</html>
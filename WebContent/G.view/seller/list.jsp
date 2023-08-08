<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/view/member/result.jsp">
내정보
</a><br>
<h3>내가 등록한 상품</h3>
<a href="${pageContext.request.contextPath }G.view/seller/addForm.jsp">
새 상품 등록
</a>
<table border="1">
	<tr>
		<th>상품명</th>
		<th>상품가격</th>
	</tr>
<c:forEach var="g" items="${Goodss }">
	<tr>
		<td><a href="${pageContext.request.contextPath }/seller/detail?seq=${g.seq }">${g.product_name }</a><</td>
		<td>${g.price }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
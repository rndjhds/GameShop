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
������
</a><br>
<h3>���� ����� ��ǰ</h3>
<a href="${pageContext.request.contextPath }G.view/seller/addForm.jsp">
�� ��ǰ ���
</a>
<table border="1">
	<tr>
		<th>��ǰ��</th>
		<th>��ǰ����</th>
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
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">
	������
	</a><br>
	
	<h3>��ü ��ǰ</h3>
	<table border="1">
	<tr><th>��ǰ�̹���</th><th>��ǰ��</th><th>����</th></tr>
	<c:forEach var="g" items="${Goodss }">
	<tr>
	<td> <img src="${g.img }" width="50" height="50"></td>
	<td><a href="${pageContext.request.contextPath }/OrderDetailController?seq=${g.seq }">${g.product_name }</a></td>
	<td>${g.price }</td>
	</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>
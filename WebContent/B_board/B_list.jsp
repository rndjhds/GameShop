<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/B_board/B_addForm.jsp">�۾���</a>

<table border="1">
<tr>
<th>�� ��ȣ</th>
<th>�� ����</th>
<th>�ۼ���</th>
<th>�ۼ���¥</th>
</tr>
<c:forEach var = "p" items="${B_Products }">
<tr>
<td>${p.seq }</td>
<td><a href="${pageContext.request.contextPath }/B_board/B_detail?num=${p.seq }"+>${p.title }</a></td>
<td>${p.content }</td>
<td>${p.reg_date }</td>
</tr>
</c:forEach>
</table>
</body>
</html>
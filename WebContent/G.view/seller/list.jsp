<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<a href="${pageContext.request.contextPath }/seller/AddForm">
�� ��ǰ ���
</a>
<table border="1">
<tr><th>��ǰ��ȣ</th><th>��ǰ��</th></tr>
<c:forEach var="g" items="${Goodss }">
<tr>
<td>${g.num }</td><td><a href="${pageContext.request.contextPath }/seller/detail?num=${g.num }">${g.name }</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
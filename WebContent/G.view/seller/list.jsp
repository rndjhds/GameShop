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
내정보
</a><br>
<h3>내가 등록한 상품</h3>
<a href="${pageContext.request.contextPath }/seller/AddForm">
새 상품 등록
</a>
<table border="1">
<tr><th>상품번호</th><th>상품명</th></tr>
<c:forEach var="g" items="${Goodss }">
<tr>
<td>${g.num }</td><td><a href="${pageContext.request.contextPath }/seller/detail?num=${g.num }">${g.name }</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
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
<a href="${pageContext.request.contextPath }/B_board/B_addForm.jsp">글쓰기</a>

<table border="1">
<tr>
<th>글 번호</th>
<th>글 제목</th>
<th>작성자</th>
<th>작성날짜</th>
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
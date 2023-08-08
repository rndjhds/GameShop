<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function b() {
	var flag = confirm("수정하시겠습니까??");
	if(flag)	{
		document.p.action = "${pageContext.request.contextPath}/B_board/B_detail?num=${p.seq}";
		document.p.submit();
	}else{
		alert("수정을 취소하였습니다.");
	}
}


</script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form name = "p" action="${pageContext.request.contextPath}/B_board/B_edit" method="post">
<table border = "1">
<tr>
<th>글번호</th>
<td>${p.seq }</td>
</tr>

<tr>
<th>글 제목</th>
<td><input type="text" name="title" value="${p.title }"></td>
</tr>

<tr>
<th>작성자</th>
<td></td>
</tr>

<tr>
<th>카테고리</th>
<td>
<select name="category" value = "${p.category }">
<option value="1">메이플1</option>
<option value="2">메이플2</option>
<option value="3">메이플3</option>
<option value="4">메이플4</option>
</select>
</td>
</tr>

<tr>
<th>글 내용</th>
<td>
<textarea rows="10" cols="30" name="content" value = "${p.content }"></textarea>
</td>
</tr>
</table>
<input type="button" value="등록" onclick="b()">
<input type="reset" value="취소" onclick = "history.back(-1)">

</form>
</body>
</html>
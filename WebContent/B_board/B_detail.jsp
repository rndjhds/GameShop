<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function a() {
	var flag = confirm("정말 삭제하시겠습니까??")
	if(flag){
		document.p.action = "${pageContext.request.contextPath}/B_board/B_del?num=${p.seq}";
		document.p.submit();
	}else{
		alert("삭제가 취소되었습니다.");
	}
}

</script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
		<th>글 번호</th>
		<td>${p.seq }</td>
		</tr>
		
		<tr>
		<th>글 제목</th>
		<td>${p.title }</td>
		</tr>
		
		<tr>
		<th>작성자</th>
		<td>max</td>
		</tr>
		
		<tr>
		<th>카테고리</th>
		<td>
		${p.category }
		</td>
		</tr>
		
		<tr>
		<th>글 내용</th>
		<td>${p.content }</td>
		</tr>
		
		<tr>
		<th>이미지</th>
		<td>${p.url }</td>
		</tr>
		
		<tr>
		<td colspan="2"> 
		</td>
		</tr>
	</table>
<form name = "p" action="${pageContext.request.contextPath }/B_board/B_search" method="post">
	<input type="hidden" name="num" value="${p.seq }"> 
	<input type="submit" value="수정">
	<input type="reset" value="삭제" onclick="a()">
		
	
	
	</form>
</body>
</html>
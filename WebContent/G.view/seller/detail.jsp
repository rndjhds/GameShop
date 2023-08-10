<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" content="text/html"; charset=EUC-KR>
	function a(){
		var flag = confirm("정말 삭제하겠습니까")
		if(flag){
			document.f.action="${pageContext.request.contextPath}/seller/Del?seq=${g.seq}";
			document.f.submit();
		}else{
			alert("삭제가 취소되었습니다.");
		}
	}
</script>
</head>
<body>
	<form name="f" action="${pageContext.request.contextPath }/seller/Edit" method="post" enctype="multipart/form-data">	<table border="1">
	<tr>
		<th>상품번호</th>
		<td><input type="text" value="${g.seq }" name="seq" readonly></td>
	</tr>
	<tr>
		<th>상품명</th>
		<td><input type="text" value="${g.product_name }" name="product_name"></td>
	</tr>
	<tr>
		<th>상품내용</th>
		<td>
			<textarea name="content" rows="5" cols="2" style="width: 165px; height: 76px;" >${g.content } </textarea>
		</td>
	</tr>
	<tr>
		<th>작성자</th>
		<td><input type="text" value="${g.register }" name="register" readonly></td>
	</tr>
	<tr>
		<th>가격</th>
		<td><input type="text" value="${g.price }" name="price"></td>
	</tr>
	<tr>
		<th>상품 이미지</th>
		<td>${g.img }<br><img src="${g.img }" width="300" height="300"/></td>
		<td><input type="file" name="file"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="수정">
		<input type="button" value="삭제" onclick="a()"></td>
	</tr>
	</table>
	</form>

</body>
</html>
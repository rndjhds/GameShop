<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" content="text/html"; charset=EUC-KR>
	function a(){
		var flag = confirm("���� �����ϰڽ��ϱ�")
		if(flag){
			document.f.action="${pageContext.request.contextPath}/seller/Del?seq=${g.seq}";
			document.f.submit();
		}else{
			alert("������ ��ҵǾ����ϴ�.");
		}
	}
</script>
</head>
<body>
	<form name="f" action="${pageContext.request.contextPath }/seller/Edit" method="post" enctype="multipart/form-data">	<table border="1">
	<tr>
		<th>��ǰ��ȣ</th>
		<td><input type="text" value="${g.seq }" name="seq" readonly></td>
	</tr>
	<tr>
		<th>��ǰ��</th>
		<td><input type="text" value="${g.product_name }" name="product_name"></td>
	</tr>
	<tr>
		<th>��ǰ����</th>
		<td>
			<textarea name="content" rows="5" cols="2" style="width: 165px; height: 76px;" >${g.content } </textarea>
		</td>
	</tr>
	<tr>
		<th>�ۼ���</th>
		<td><input type="text" value="${g.register }" name="register" readonly></td>
	</tr>
	<tr>
		<th>����</th>
		<td><input type="text" value="${g.price }" name="price"></td>
	</tr>
	<tr>
		<th>��ǰ �̹���</th>
		<td>${g.img }<br><img src="${g.img }" width="300" height="300"/></td>
		<td><input type="file" name="file"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="����">
		<input type="button" value="����" onclick="a()"></td>
	</tr>
	</table>
	</form>

</body>
</html>
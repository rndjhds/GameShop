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
			document.f.action="${pageContext.request.contextPath}/seller/Del?num=${g.num}";
			document.f.submit();
		}else{
			alert("������ ��ҵǾ����ϴ�.");
		}
	}
</script>
</head>
<body>
	<form name="f" action="${pageContext.request.contextPath }/seller/Edit" method="post">
	<table border="1">
	<tr>
	<th>��ǰ��</th><td><input type="text" value="${g.name }" name="Product_name"></td>
	</tr>
	<tr>
	<th>����</th><td><input type="text" vlaue="${g.price }" name="price"></td>
	</tr>
	<tr>
	<th>��ǰ �̹���</th><td>${g.img }<br><img src="${g.img }" width="300" height="300"/>
	</td>
	</tr>
	<tr>
	<td colspan="2"><input type="submit" value="����">
	<input type="button" value="����" onclick="a()"></td>
	</tr>
	</table>
	<input type = "hidden" name="num" value="{g.num}">
	</form>

</body>
</html>
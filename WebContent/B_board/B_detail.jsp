<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function a() {
	var flag = confirm("���� �����Ͻðڽ��ϱ�??")
	if(flag){
		document.p.action = "${pageContext.request.contextPath}/B_board/B_del?num=${p.seq}";
		document.p.submit();
	}else{
		alert("������ ��ҵǾ����ϴ�.");
	}
}

</script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
		<th>�� ��ȣ</th>
		<td>${p.seq }</td>
		</tr>
		
		<tr>
		<th>�� ����</th>
		<td>${p.title }</td>
		</tr>
		
		<tr>
		<th>�ۼ���</th>
		<td>max</td>
		</tr>
		
		<tr>
		<th>ī�װ�</th>
		<td>
		${p.category }
		</td>
		</tr>
		
		<tr>
		<th>�� ����</th>
		<td>${p.content }</td>
		</tr>
		
		<tr>
		<th>�̹���</th>
		<td>${p.url }</td>
		</tr>
		
		<tr>
		<td colspan="2"> 
		</td>
		</tr>
	</table>
<form name = "p" action="${pageContext.request.contextPath }/B_board/B_search" method="post">
	<input type="hidden" name="num" value="${p.seq }"> 
	<input type="submit" value="����">
	<input type="reset" value="����" onclick="a()">
		
	
	
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function b() {
	var flag = confirm("�����Ͻðڽ��ϱ�??");
	if(flag)	{
		document.p.action = "${pageContext.request.contextPath}/B_board/B_detail?num=${p.seq}";
		document.p.submit();
	}else{
		alert("������ ����Ͽ����ϴ�.");
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
<th>�۹�ȣ</th>
<td>${p.seq }</td>
</tr>

<tr>
<th>�� ����</th>
<td><input type="text" name="title" value="${p.title }"></td>
</tr>

<tr>
<th>�ۼ���</th>
<td></td>
</tr>

<tr>
<th>ī�װ�</th>
<td>
<select name="category" value = "${p.category }">
<option value="1">������1</option>
<option value="2">������2</option>
<option value="3">������3</option>
<option value="4">������4</option>
</select>
</td>
</tr>

<tr>
<th>�� ����</th>
<td>
<textarea rows="10" cols="30" name="content" value = "${p.content }"></textarea>
</td>
</tr>
</table>
<input type="button" value="���" onclick="b()">
<input type="reset" value="���" onclick = "history.back(-1)">

</form>
</body>
</html>
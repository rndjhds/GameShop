<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h3>��ǰ ���</h3>
<form action="${pageContext.request.contextPath}/AddController" method="post" enctype="multipart/form-data">

��ǰ��:<input type="text" name="name"><br>
����: <input type="text" name="price"><br>
��ǰ�̹��� ���:<input type="file" name="file"><br>
��ǰ�󼼼���:<textarea rows = "10" cols="30" name="content"> </textarea> <br>

<input type="submit" value="���">

</form>

</body>
</html>
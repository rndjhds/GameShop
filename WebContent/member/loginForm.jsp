x<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript">


function validateForm() {
    var id = document.forms["loginForm"]["id"].value;
    var password = document.forms["loginForm"]["password"].value;

    if (id === "") {
        alert("���̵� �Է����ּ���.");
        return false;
    }

    if (password === "") {
        alert("��й�ȣ�� �Է����ּ���.");
        return false;
    }
}

</script>
<title>Game Shop login</title>
</head>
<style>
    header{
        margin-top: 80px;
    }
    h1,h4{
        color: rgb(62, 151, 219);
        text-align: center;
    }
    h1{
        font-size: 3rem;
        color: rgb(62, 151, 219);
    }
    .information{
        border-top: 5px solid rgb(1, 39, 176);
        border-bottom: 5px solid rgb(1, 39, 176);
        padding-top: 60px;
        width: 600px;
        height: 240px;
        text-align: center;
        margin-left: auto;
        margin-right: auto;
        border-radius: 20px;
    }
    
    input{
        border-radius: 10px;
        border-width: 1px;
        margin-bottom: 20px;
        width: 500px;
        height: 40px;
    }
    .find{
        text-align: center;
        margin-top: 20px;
    }
    .find>a{
        padding-right: 40px;
    }
    
       input[type="submit"] {
        background-color: rgb(152, 207, 250);
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.2s;
    }

    	input[type="submit"]:active {
        background-color: rgb(112, 177, 230); /* ������ ���� ���� ���� */
    }
    
</style>
<body>
<header>
    <div class="headtext">
        <h1>
            Game Shop GS
        </h1>
        <h4>
            ������ ȯ���մϴ�.
        </h4>
    </div>
</header>
<main>
    <div class="maintext">
        <form name="loginForm" action="${pageContext.request.contextPath}/LoginController" method="post" onsubmit="return validateForm();">
            <div class="information">
                <input type="text" placeholder="���̵� �Է��Ͻÿ�." name="id"><br>
                <input type="password" placeholder="��й�ȣ�� �Է��Ͻÿ�." name="password"><br>
                <input type="submit" value="�α���" name="rogin" style="background-color: rgb(152, 207, 250);">
            </div>
        </form>
        <div class="find">
            <a href="${pageContext.request.contextPath }/member/editForm.jsp">ȸ������</a>
        </div>
    </div>
</main>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
        <form method="post">
            <div class="information">
                <input type="text" placeholder="���̵� �Է��Ͻÿ�." name="id"><br>
                <input type="password" placeholder="��й�ȣ�� �Է��Ͻÿ�." name="pwd"><br>
                <input type="submit" value="�α���" name="rogin" style="background-color: rgb(152, 207, 250);">
            </div>
        </form>
        <div class="find">
            <a>���̵� ã��</a>
            <a>��й�ȣ ã��</a>
            <a>ȸ������</a>
        </div>
    </div>
</main>
</body>
</html>

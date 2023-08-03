<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
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
            입장을 환영합니다.
        </h4>
    </div>
</header>
<main>
    <div class="maintext">
        <form action="${pageContext.request.contextPath}/LoginController"  method="post">
            <div class="information">
                <input type="text" placeholder="아이디를 입력하시오." name="id"><br>
                <input type="password" placeholder="비밀번호를 입력하시오." name="password"><br>
                <input type="submit" value="로그인" name="rogin" style="background-color: rgb(152, 207, 250);">
            </div>
        </form>
        <div class="find">
            <a>아이디 찾기</a>
            <a>비밀번호 찾기</a>
            <a href="${pageContext.request.contextPath }/member/editForm.jsp">회원가입</a>
        </div>
    </div>
</main>
</body>
</html>

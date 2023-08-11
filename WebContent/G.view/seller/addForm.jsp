<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<%@include file="/common/header.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>�Խ��� ���</title>
    <style>
        html {
            padding-bottom: 80px;
        }

        header > h1 {
            font-size: 4rem;
            text-align: center;
            color: rgb(35, 160, 255);
        }

       .main {
            border: 5px solid rgb(35, 160, 255);
            border-radius: 60px;
            width: 700px;
            margin-left: auto;
            margin-right: auto;
            margin-bottom: 30px;
        }

        ul {
            list-style: none;
            padding-bottom: 25px;
            padding-left: 0%;
        }

        li {
            padding-bottom: 25px;
        }

        .idpwd {
            text-align: center;
            margin-bottom: 50px;
            padding-top: 25px;
        }

        .information {
            text-align: center;
            margin-bottom: 50px;
        }

        footer {
            margin-top: 70px;
        }
    </style>
</head>
<body>
<header>
    <h1>Game_Shop</h1>
</header>

<form method="post" action="${pageContext.request.contextPath}/AddController" enctype="multipart/form-data" id="tab" name="tab" class="tab">
    <main class="main">
        <div>
            <p>
               <ul class="idpwd">
                   <li>
                        ��ǰ��<br><input type="text" name="name" id="name" style="width: 400px; height: 30px;">
                   </li>
               </ul>
            </p>
            <p>
               <ul class="information">
                   <li>
                     ���ε� �̹���<br><input type="file" name="img" id="img" style="width : 400px; height: 30px;"> 
                  </li>
                  <li>
                  	  ����<br><input type="number" name="price" id="price" style="width : 400px; height: 30px;">
                  </li>
                  <li>
                         ��ǰ ����<br>
                  <textarea name="content" rows="20" cols="60"></textarea>
                      </li>
               </ul>
            </p>
        </div>
    </main>

    <input type="submit" name="button" value="����ϱ�"
           style="width: 300px; height: 50px; background-color:rgb(35, 160, 255);
                            color:white; font-size: 20px; border: 0px; margin-left: 41%; display:block;">


</form>
</body>
<%@include file="/common/footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>
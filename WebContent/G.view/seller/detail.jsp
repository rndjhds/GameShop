<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<%@include file="/common/header.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>상품 수정</title>
    <script type="text/javascript">
	    function del(){
			var flag = confirm("정말 삭제하겠습니까")
			if(flag){
				document.f.action="${pageContext.request.contextPath}/seller/Del?seq=${g.seq}";
				document.f.submit();
			}else{
				alert("삭제가 취소되었습니다.");
			}
		}
	</script>
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

<form method="post" action="${pageContext.request.contextPath}/seller/Edit" enctype="multipart/form-data" id="f" name="f" class="tab">
    <main class="main">
        <div>
            <p>
               <ul class="idpwd">
                   <li>
                        상품번호<br><input type="text" name="seq" id="seq" style="width: 400px; height: 30px;" value="${g.seq }" readonly>
                   </li>
                   <li>
                        상품명<br><input type="text" name="product_name" id="product_name" style="width: 400px; height: 30px;" value="${g.product_name }">
                   </li>
               </ul>
            </p>
            <p>
               <ul class="information">
                   <li>
                       상품내용<br>
                          <textarea name="content" rows="20" cols="50" >${g.content } </textarea>
                   </li>
                   <li>
                    	작성자<br>
                    	<input type="text" name="register" id="register" style="width : 400px; height: 30px;" value="${g.register }"> 
                  </li>
                  <li>
                        가격<br>
                  		<input type="text" name="price" id="price" style="width : 400px; height: 30px;" value="${g.price }"> 
                  </li>
                  <li>
                  	상품 이미지<br>
                  	<img src="${g.img }" width="300" height="300"/>
                  </li>
                  <li>
                  	수정 이미지<br>
                  	<input type="file" name="file">
                  </li>
               </ul>
            </p>
        </div>
    </main>

    <input type="submit" name="button" value="수정하기"
           style="width: 300px; height: 50px; background-color:rgb(35, 160, 255);
                            color:white; font-size: 20px; border: 0px; margin-left: 41%; display:block;">

	 <input type="button" name="button" value="삭제하기"
           style="width: 300px; height: 50px; background-color:rgb(35, 160, 255);
                            color:white; font-size: 20px; border: 0px; margin-left: 41%; display:block;" onclick="del()" >
</form>
</body>
<%@include file="/common/footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>
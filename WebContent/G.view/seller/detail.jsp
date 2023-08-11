<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판 등록</title>]<script type="text/javascript" content="text/html"; charset=EUC-KR>
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
    <h1>My List</h1>
</header>

<form name="f" action="${pageContext.request.contextPath }/seller/Edit" method="post" enctype="multipart/form-data">	
	<main class="main">
	<table border="1">
		<tr>
		
		<ul class="idpwd">
		
		<ul class="information"></ul>
			<th>상품번호</th>
			<td><input type="text" value="${g.seq }" name="seq" readonly></td>
		</tr>
		<tr>
			<th>상품명</th>
			<td><input type="text" value="${g.product_name }" name="product_name"></td>
		</tr>
		<tr>
			<th>상품내용</th>
			<td>
				<textarea name="content" rows="5" cols="2" style="width: 165px; height: 76px;" >${g.content } </textarea>
			</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" value="${g.register }" name="register" readonly></td>
		</tr>
		<tr>
			<th>가격</th>
			<td><input type="text" value="${g.price }" name="price"></td>
		</tr>
		<tr>
			<th>상품 이미지</th>
			<td>${g.img }<br><img src="${
			g.img }" width="300" height="300"/></td>
			<td><input type="file" name="file"></td>
		</tr>
		<tr>
			
		</tr>
	</table>
	<table border="1"> 
	<tr>
	<td>
	 <input type="submit" name="button" value="수정하기"
           style="width: 200px; height: 50px; background-color:rgb(35, 160, 255);
                            color:white; font-size: 20px; border: 0px; margin-left: 41%; display:block;">
      </td>  
      <td>                    
     <input type="button" name="button" value="삭제하기"
           style="width: 200px; height: 50px; background-color:rgb(35, 160, 255);
                            color:white; font-size: 20px; border: 0px; margin-left: 41%; display:block;" onclick="del()" >
	</td>	
	</tr>
	</table>
	
	</form>
</body>
<%@include file="/common/footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>
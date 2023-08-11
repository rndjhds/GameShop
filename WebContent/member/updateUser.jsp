<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="member.model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
    <script>
        //우편번호, 주소 Daum API
        function openDaumPostcode() {
            new daum.Postcode({
                oncomplete: function (data) {
                    // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
                    // 우편번호와 주소 정보를 해당 필드에 넣고, 커서를 상세주소 필드로 이동한다.
                    document.getElementById('mem_post').value = data.zonecode;
                    document.getElementById('mem_addr1').value = data.address;
                }
            }).open();

        }

</script>
<style>
   
body {
    margin: 0;
    padding-top: 40px;
    color: #2e323c;
    background: #f5f6fa;
    position: relative;
    height: 100%;
}
.account-settings .user-profile {
    margin: 0 0 1rem 0;
    padding-bottom: 1rem;
    text-align: center;
}
.account-settings .user-profile .user-avatar {
    margin: 0 0 1rem 0;
}
.account-settings .user-profile .user-avatar img {
    width: 90px;
    height: 90px;
    -webkit-border-radius: 100px;
    -moz-border-radius: 100px;
    border-radius: 100px;
}
.account-settings .user-profile h5.user-name {
    margin: 0 0 0.5rem 0;
}
.account-settings .user-profile h6.user-email {
    margin: 0;
    font-size: 0.8rem;
    font-weight: 400;
    color: #9fa8b9;
}
.account-settings .about {
    margin: 2rem 0 0 0;
    text-align: center;
}
.account-settings .about h5 {
    margin: 0 0 15px 0;
    color: #007ae1;
}
.account-settings .about p {
    font-size: 0.825rem;
}
.form-control {
    border: 1px solid #cfd1d8;
    -webkit-border-radius: 2px;
    -moz-border-radius: 2px;
    border-radius: 2px;
    font-size: .825rem;
    background: #ffffff;
    color: #2e323c;
}

.card {
    background: #ffffff;
    -webkit-border-radius: 5px;
    -moz-border-radius: 5px;
    border-radius: 5px;
    border: 0;
    margin-bottom: 1rem;
}
</style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<div class="container">
<form method="post" action="${pageContext.request.contextPath }/EditController" enctype="multipart/form-data">
<input type="hidden" name="profile" value="${m.url}">
<div class="row gutters">
<div class="col-xl-3 col-lg-3 col-md-12 col-sm-12 col-12">
<div class="card h-100">
   <div class="card-body">
      <div class="account-settings">
         <div class="user-profile">
            <div class="user-avatar">
               <img src="${m.url }" alt="Maxwell Admin">
               <input type="file" class="form-control" id="file" name="file">
            </div>
            <h5 class="user-name">${m.id }</h5>
            <h6 class="user-email">${m.email }</h6>
         </div>
      </div>
   </div>
</div>
</div>
<div class="col-xl-9 col-lg-9 col-md-12 col-sm-12 col-12">
<div class="card h-100">
   <div class="card-body">
      <div class="row gutters">
         <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
            <h6 class="mb-2 text-primary">Personal Details</h6>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="fullName">Id</label>
               <input type="text" class="form-control" id="id" placeholder="Enter full name" readonly value="${m.id}" name="id"}>
            </div>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="fullName">PassWord</label>
               <input type="text" class="form-control" id="password" placeholder="Enter full name" value="${m.password}" name="password"}>
            </div>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="eMail">Email</label>
               <input type="email" class="form-control" id="email" placeholder="Enter email ID" value="${m.email }" name="email">
            </div>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="phone">Phone</label>
               <input type="text" class="form-control" id="tel" placeholder="Enter phone number" value="${m.tel }" name="tel">
            </div>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="website">BirthDay</label>
               <input type="date" class="form-control" id="birth" value="${m.birth }" name="birth">
            </div>
         </div>
      </div>
      <div class="row gutters">
         <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
            <h6 class="mt-3 mb-2 text-primary">Address</h6>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="Street">Street</label>
               <input type="text" class="form-control" id="mem_post" value="${mem_post }" name="mem_post">
               <button type="button" class="btn btn-secondary" value="주소 검색" onClick="openDaumPostcode()">주소 검색</button>
            </div>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="">address</label>
               <input type="text" class="form-control" id="mem_addr1" value="${mem_addr1 }" name="mem_addr1">
            </div>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="sTate">detail address</label>
               <input type="text" class="form-control" id="mem_addr2" value="${mem_addr2 }" name="mem_addr2">
            </div>
         </div>
         <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="form-group">
               <label for="sTate">유형</label>
               <select name="type" class="form-control">
                  <option value="1" <c:if test = "${m.type eq 1}">selected = "selected"</c:if>>구매자</option>
                  <option value="2" <c:if test = "${m.type eq 2}">selected = "selected"</c:if>>판매자</option>
               </select>
            </div>
         </div>
      </div>
      <div class="row gutters">
         <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
            <div class="text-right">
               <button type="button" id="submit" name="submit" class="btn btn-secondary" onclick="history.go(-1)">취소</button>
               <button type="button" id="submit" name="submit" class="btn btn-secondary" onclick="location.href='${pageContext.request.contextPath}/common/main.jsp'">홈으로</button>
               <button type="submit" id="submit" name="submit" class="btn btn-primary">수정</button>
               <button type="button" id="submit" name="submit" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/DelController'" >회원탈퇴</button>
            </div>
         </div>
      </div>
   </div>
</div>
</div>
</div>
</form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>
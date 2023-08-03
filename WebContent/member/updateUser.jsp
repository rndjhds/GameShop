<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="member.model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
//우편번호, 주소 Daum API
function openDaumPostcode() {
   new daum.Postcode({
      oncomplete : function(data) {            
         // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
         // 우편번호와 주소 정보를 해당 필드에 넣고, 커서를 상세주소 필드로 이동한다.
         document.getElementById('mem_post').value = data.zonecode;
         document.getElementById('mem_addr1').value = data.address;            
      }
   }).open();
   
}

</script>

</head>
<body>

	<h3>내정보 수정</h3>
	<form action="${pageContext.request.contextPath }/EditController" method="post">
		<h5 class="empty1">아이디</h5>
      <input type="text" name="id" id="id" value="${sessionScope.id}"/>
      <div id="tex"></div>
      
      
      <h5 class="empty">비밀번호</h5>
      <input type="password" name="password" id="password" class="mem"/>
      
      
      
      <h5 class="empty">비밀번호 확인</h5>
      <input type="password" name="password2" id="password2" class="mem"/>

	  
	  <%-- 비밀번호 확인 스크립트 한개 만들기  --%>


      <h5 class="empty">전화번호</h5>
      <select name="mem_phone1">
         <option value="010">010</option>
         <option value="011">011</option>
         <option value="012">012</option>
         <option value="013">013</option>
      </select>-
      <input type="text" name="tel" id="tel"/>
      

      <h5 class="empty">회원유형</h5>
      <input type="radio" name="type" id="type" value="1"/>일반회원
      <input type="radio" name="type" id="type" value="2"/>판매자
      

      <h5 class="empty" >우편번호</h5>
      <input type="text" name="mem_post" id="mem_post" readonly>
      <input type="button" value="우편번호검색" onClick="openDaumPostcode()"/>
      
      <h5 class="empty">주소</h5>
      <input type="text" name="mem_addr1" id="mem_addr1" class="mem" readonly/>
      
      <h5 class="empty">상세주소</h5>
      <input type="text" name="mem_addr2" id="mem_addr2" class="mem"/>


       <%-- address변수에 mem_post,mem_addr1,mem_addr2 다 넣기 --%>
       
       
       <h5 class="empty">생일</h5>
      <input type="date" name="birth" id="birth"/>
      
      
      <h5 class="empty">이메일</h5>
      <input type="text" name="email" id="email"/>@<input type="text" name="mem_domain" id="mem_domain"/>
      <select id="mail_list" onchange="domain_list()">
         <option value="">직접입력</option>
         <option value="daum.net">daum.net</option>
         <option value="nate.com">nate.com</option>
         <option value="naver.com">naver.com</option>
         <option value="hotmail.com">hotmail.com</option>
         <option value="gmail.com">gmail.com</option>
      </select>
      <br>
      <br> 
      
      <div class="position1">
      <input type="submit" value="정보수정" id="update_up"/>
      </div>
   </form>
   </div>


</body>
</html>
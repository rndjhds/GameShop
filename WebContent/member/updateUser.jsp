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
//�����ȣ, �ּ� Daum API
function openDaumPostcode() {
   new daum.Postcode({
      oncomplete : function(data) {            
         // �˾����� �˻���� �׸��� Ŭ�������� ������ �ڵ带 �ۼ��ϴ� �κ�.
         // �����ȣ�� �ּ� ������ �ش� �ʵ忡 �ְ�, Ŀ���� ���ּ� �ʵ�� �̵��Ѵ�.
         document.getElementById('mem_post').value = data.zonecode;
         document.getElementById('mem_addr1').value = data.address;            
      }
   }).open();
   
}

</script>

</head>
<body>

	<h3>������ ����</h3>
	<form action="${pageContext.request.contextPath }/EditController" method="post">
		<h5 class="empty1">���̵�</h5>
      <input type="text" name="id" id="id" value="${sessionScope.id}"/>
      <div id="tex"></div>
      
      
      <h5 class="empty">��й�ȣ</h5>
      <input type="password" name="password" id="password" class="mem"/>
      
      
      
      <h5 class="empty">��й�ȣ Ȯ��</h5>
      <input type="password" name="password2" id="password2" class="mem"/>

	  
	  <%-- ��й�ȣ Ȯ�� ��ũ��Ʈ �Ѱ� �����  --%>


      <h5 class="empty">��ȭ��ȣ</h5>
      <select name="mem_phone1">
         <option value="010">010</option>
         <option value="011">011</option>
         <option value="012">012</option>
         <option value="013">013</option>
      </select>-
      <input type="text" name="tel" id="tel"/>
      

      <h5 class="empty">ȸ������</h5>
      <input type="radio" name="type" id="type" value="1"/>�Ϲ�ȸ��
      <input type="radio" name="type" id="type" value="2"/>�Ǹ���
      

      <h5 class="empty" >�����ȣ</h5>
      <input type="text" name="mem_post" id="mem_post" readonly>
      <input type="button" value="�����ȣ�˻�" onClick="openDaumPostcode()"/>
      
      <h5 class="empty">�ּ�</h5>
      <input type="text" name="mem_addr1" id="mem_addr1" class="mem" readonly/>
      
      <h5 class="empty">���ּ�</h5>
      <input type="text" name="mem_addr2" id="mem_addr2" class="mem"/>


       <%-- address������ mem_post,mem_addr1,mem_addr2 �� �ֱ� --%>
       
       
       <h5 class="empty">����</h5>
      <input type="date" name="birth" id="birth"/>
      
      
      <h5 class="empty">�̸���</h5>
      <input type="text" name="email" id="email"/>@<input type="text" name="mem_domain" id="mem_domain"/>
      <select id="mail_list" onchange="domain_list()">
         <option value="">�����Է�</option>
         <option value="daum.net">daum.net</option>
         <option value="nate.com">nate.com</option>
         <option value="naver.com">naver.com</option>
         <option value="hotmail.com">hotmail.com</option>
         <option value="gmail.com">gmail.com</option>
      </select>
      <br>
      <br> 
      
      <div class="position1">
      <input type="submit" value="��������" id="update_up"/>
      </div>
   </form>
   </div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>회원 가입</title>
    <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
    <script>
        // 우편번호, 주소 Daum API
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

        function checkPassword() {
            var password = document.getElementById('password').value;
            var password2 = document.getElementById('password2').value;

            if (password === password2) {
                alert('비밀번호가 일치합니다.');
            } else {
                alert('비밀번호가 일치하지 않습니다. 다시 입력해주세요.');
            }
        }
        
       
   
    </script>
    <style>
     h3 {
        text-align: center;
    }

    .input-group {
        margin-bottom: 10px;
    }

    .input-group label {
        font-weight: bold;
    }

    .input-group input[type="text"],
    .input-group input[type="password"],
    .input-group input[type="date"] {
        width: 200px;
        margin-left: 10px;
    }

    .input-group select {
        width: 80px;
        margin-left: 10px;
    }

    .input-group input[type="button"],
    .input-group input[type="submit"] {
        margin-left: 10px;
    }
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f8f8;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .main-container {
        max-width: 600px;
        padding: 20px;
        background-color: #f0f5ff; /* Light Blue */
        border-radius: 10px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }
    h5 {
        color: #3e97db;
        margin-top: 10px;
    }
    input[type="text"],
    input[type="password"],
    select {
        border-radius: 5px;
        border: 1px solid #ccc;
        padding: 5px;
        width: 100%;
        margin-bottom: 10px;
    }
    .position1 {
        text-align: center;
        margin-top: 10px;
    }
    #sign_up {
        background-color: #3e97db;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }
    #sign_up:hover {
        background-color: #1a66a9;
    }
    </style>
</head>
<body>
   

    <div class="main-container">
        <form action="${pageContext.request.contextPath }/JoinController" method="post" id="tab" name="editFrom" class="tab" enctype="multipart/form-data">
           
        <div class="input-group">
                <label for="id">아이디</label>
                <input type="text" name="id" id="id"/>
            </div>
            
            <div class="input-group">
                <label for="password">비밀번호</label>
                <input type="password" name="password" id="password"/>
            </div>
            
            <div class="input-group">
                <label for="password2">비밀번호 확인</label>
                <input type="password" name="password2" id="password2"/>
            </div>
            
            <div class="input-group">
			    <label for="tel">전화번호</label> <br>
			    <div style="display: flex;">
			        <select name="mem_phone1" style="width: 60px; margin-right: 5px;">
			            <option value="010">010</option>
			            <option value="011">011</option>
			            <option value="012">012</option>
			            <option value="013">013</option>
			        </select>
			        <input type="text" name="tel" id="tel" style="flex: 1; max-width: 160px;" />
			    </div>
			</div>
            
            <div class="input-group">
                <label for="type">회원유형</label>
                <input type="radio" name="type" id="type" value="1" checked="checked"/>일반회원
                <input type="radio" name="type" id="type" value="2"/>판매자
            </div>
            
            <div class="input-group">
                <label for="mem_post">우편번호</label>
                <input type="text" name="mem_post" id="mem_post" readonly>
                <input type="button" value="우편번호검색" onClick="openDaumPostcode()"/>
            </div>
            
            <div class="input-group">
                <label for="mem_addr1">주소</label>
                <input type="text" name="mem_addr1" id="mem_addr1" readonly/>
            </div>
            
            <div class="input-group">
                <label for="mem_addr2">상세주소</label>
                <input type="text" name="mem_addr2" id="mem_addr2"/>
            </div>
            
            <div class="input-group">
                <label for="birth">생일</label>
                <input type="date" name="birth" id="birth" />
            </div>
            
		    <div class="input-group">
		    <label for="email">이메일</label>
		    <div style="display: flex;">
		        <input type="text" name="email" id="email" style="flex: 1; max-width: 150px;" />
		        <input type="text" name="mem_domain" id="mem_domain" style="max-width: 100px; margin-right: 5px;" />
		        <select id="mail_list" onchange="domain_list()" style="max-width: 100px;">
		            <option value="">직접입력</option>
		            <option value="daum.net">daum.net</option>
		            <option value="nate.com">nate.com</option>
		            <option value="naver.com">naver.com</option>
		            <option value="hotmail.com">hotmail.com</option>
		            <option value="gmail.com">gmail.com</option>
		        </select>
		    </div>
		</div>
			
			<div class="input-group">
			<input type="file" name="file">			
			</div>

            
            <div class="input-group">
                <input type="submit" value="회원가입" id="sign_up"/>
            </div>
        </form>
    </div>
</body>
</html>

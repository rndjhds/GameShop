<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@include file="/common/header.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>Game Shop Main</title>
    <style>
        /* ���� ���� ��Ÿ�� */
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f8f8;
            margin: 20px;
        }
        .main-container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #3e97db;
            text-align: center;
            margin-bottom: 20px;
        }
        .main-content {
            text-align: center;
        }
        .main-content a {
            display: block;
            margin: 10px;
            color: #3e97db;
            text-decoration: none;
        }
        .main-content a:hover {
            text-decoration: underline;
        }
        /* �޴��� ��Ÿ�� */
        .menu-bar {
            background-color: #3e97db;
            padding: 10px;
            border-radius: 5px;
            text-align: right;
        }
        .menu-bar a {
            color: #fff;
            margin-left: 20px;
            text-decoration: none;
        }
        .menu-bar a:first-child {
            margin-left: 0;
        }
        .menu-bar a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="main-container">
        <div class="menu-bar">
            <a href="${pageContext.request.contextPath}/SearchController">�� ���� ����</a>
            <a href="${pageContext.request.contextPath}/LogoutController">�α׾ƿ�</a>
            <a href="${pageContext.request.contextPath}/DelController">ȸ��Ż��</a>
            <!-- �޴��ٿ� �ʿ��� �޴� �׸��� �߰����ּ��� -->
        </div>
        <h1>${sessionScope.id}�� ȯ���մϴ�.</h1>
        </body>
<%@include file="/common/footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>
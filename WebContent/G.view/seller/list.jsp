<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css" integrity="sha256-2XFplPlrFClt0bIdPgpz8H7ojnk10H69xRqd9+uTShA=" crossorigin="anonymous" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">|
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<style>
   body{margin-top:20px;}
   .product-rating {
       line-height: 22px;
   }
   .product-rating i {
       color: #fc0;
       display: inline-block;
       margin-right: 2px;
       font-size: 14px;
   }
   @media screen and (max-width: 1199px) {
       .product-rating {
           margin-bottom: 5px;
           font-size: 15px;
       }
   }
   @media screen and (max-width: 767px) {
       .product-rating i {
           font-size: 13px;
       }
   }
   .text-secondary {
       color: #004975 !important;
   }
   .card-wrapper {
       position: relative;
       overflow: hidden;
   }
   .card-wrapper .card-img {
       text-align: center;
       position: relative;
       overflow: hidden;
       transition: all 0.3s ease-out;
   }
   .card-wrapper .card-img img {
       transition: all 0.3s ease-in-out;
       border-radius: 0.25rem;
       border-radius: 0.25rem;
   }
   .card-wrapper .card-body {
       position: absolute;
       top: 0;
       left: 0;
       right: 0;
       bottom: 0;
       visibility: hidden;
       padding: 30px;
       text-align: center;
       display: flex;
       align-items: center;
       justify-content: center;
       border-radius: 0.25rem;
       transform: translateX(-100%);
       transition: 0.8s;
       z-index: 11;
   }
   .card-wrapper:before {
       content: "";
       width: 100%;
       position: absolute;
       height: 100%;
       top: 0;
       right: 100%;
       z-index: 9;
       transition: 0.8s;
       background: rgba(0, 186, 238, 0.82);
       border-radius: 0.25rem;
   }
   .card-wrapper:hover:before {
       right: 0;
   }
   .card-wrapper h3,
   .card-wrapper p {
       color: #fff;
   }
   .card-wrapper .read-more {
       color: #fff;
   }
   .card-wrapper .read-more:after {
       color: #fff;
   }
   .card-wrapper:hover .card-body {
       visibility: visible;
       transform: translateX(0px);
   }
   .card-wrapper:hover .backgound-color {
       right: 0;
   }
   .ti-shopping-cart:before {
       content: "\e60d";
   }
   .mb-2-6, .my-2-6 {
       margin-bottom: 2.6rem;
   }
   .text-primary {
       color: #00baee !important;
   }
</style>
</head>
<body>

<section>
    <div class="container">
       <a href="${pageContext.request.contextPath}/G.view/seller/addForm.jsp" style="text-align:left;">상품 등록</a>
        <div class="row">
           <c:forEach var="g" items="${Goodss }">
            <div class="col-sm-6 col-lg-3 mb-2-6">
                <div class="card-wrapper mb-4">
                    <div class="card-img"><img src="${g.img}" style="width:240px; height:240px;"></div>
                    <div class="card-body">
                        <div>
                            <a href="${pageContext.request.contextPath }/seller/detail?seq=${g.seq }"><i class="bg-white p-3 rounded-circle ti-shopping-cart font-weight-600"></i></a>
                        </div>
                    </div>
                </div>
                <div class="text-center">
                    <h3 class="h5 mb-2"><a href="${pageContext.request.contextPath }/seller/detail?seq=${g.seq }" class="text-secondary">${g.product_name}</a></h3>
                    <h5 class="mb-0 text-primary">${g.reg_date}</h5>
                    <h4 class="mb-0 text-primary">${g.price}</h4>
                </div>
            </div>
            </c:forEach>
        </div>
    </div>
</section>
</body>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>
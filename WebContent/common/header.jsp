<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
	<main>
		<div class="container">
			<header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
				<ul class="nav nav-tabs">
					<li class="nav-item">
				    	<h3><a class="nav-link active" aria-current="page" href="#">Home</a></h3>
					</li>
					<li class="nav-item dropdown">
						<h3><a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Board</a>
					   	<ul class="dropdown-menu">
					    	<h4><li><a class="dropdown-item" href="${pageContext.request.contextPath }/B_board/B_list?category=1">Maple M</a></li></h4>
					      	<h4><li><a class="dropdown-item" href="${pageContext.request.contextPath }/B_board/B_list?category=2">Battle Ground</a></li></h4>
					      	<h4><li><a class="dropdown-item" href="${pageContext.request.contextPath }/B_board/B_list?category=3">Sudden Attack</a></li></h4>
					      	<h4><li><a class="dropdown-item" href="${pageContext.request.contextPath }/B_board/B_list?category=4">FIFA 4</a></li></h4>
					      	<h4><li><a class="dropdown-item" href="${pageContext.request.contextPath }/B_board/B_list?category=5">리니지</a></li></h4>
					    </ul>
					    </h3>
					</li>
					<li class="nav-item">
						<h3><a class="nav-link" href="${pageContext.request.contextPath}/ListGoodsServlet">Shop</a></h3>
					</li>
					<li class="nav-item">
						<h3><a class="nav-link" href="${pageContext.request.contextPath}/ListGoodsServlet">MyList</a></h3>
					</li>
				</ul>	
				<div class="col-md-3 text-end">
				<c:if test="${sessionScope.id eq null }">
					<button type="button" class="btn btn-outline-primary me-2" onclick="location.href='${pageContext.request.contextPath}/LoginController'">Login</button>
					<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/JoinController'">Sign-up</button>
				</c:if>
				<c:if test="${sessionScope.id ne null }">
					<button type="button" class="btn btn-outline-primary me-2" onclick="location.href='${pageContext.request.contextPath}/SearchController'">Profile</button>
					<button type="button" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/LogoutController'">Logout</button>
				</c:if>
				</div>				
			</header>
		</div>
	</main>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<<<<<<< HEAD
</html>
=======
</html>
>>>>>>> G_Member

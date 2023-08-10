<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
	<main>
		<div class="album py-5 bg-body-tertiary">
			<div class="container">
				<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
					<div class="col">
						<div class="card shadow-sm">
							<a href="#"><img class="bd-placeholder-img card-img-top" width="100%" height="225" src="${pageContext.request.contextPath}/img/KakaoTalk_20230808_164017784.jpg"></a>
							<div class="card-body">
								<p class="card-text" style="direction: ltr; text-align: left;">이것은 추가 콘텐츠에 대한 자연스러운 소개로 아래에 지원 텍스트가 있는 더 넓은 카드입니다. 이 내용은 조금 더 깁니다.</p>
								<div class="d-flex justify-content-between align-items-center">
									<div class="btn-group">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col">
						<div class="card shadow-sm">
							<a href="#"><img class="bd-placeholder-img card-img-top" width="100%" height="225" src="${pageContext.request.contextPath}/img/KakaoTalk_20230808_164017784_02.jpg"></a>
							<div class="card-body">
								<p class="card-text" style="direction: ltr; text-align: left;">이것은 추가 콘텐츠에 대한 자연스러운 소개로 아래에 지원 텍스트가 있는 더 넓은 카드입니다. 이 내용은 조금 더 깁니다.</p>
								<div class="d-flex justify-content-between align-items-center">
									<div class="btn-group">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col">
						<div class="card shadow-sm">
							<a href="#"><img class="bd-placeholder-img card-img-top" width="100%" height="225" src="${pageContext.request.contextPath}/img/KakaoTalk_20230808_164017784_01.jpg"></a>
							<div class="card-body">
								<p class="card-text" style="direction: ltr; text-align: left;">이것은 추가 콘텐츠에 대한 자연스러운 소개로 아래에 지원 텍스트가 있는 더 넓은 카드입니다. 이 내용은 조금 더 깁니다.</p>
								<div class="d-flex justify-content-between align-items-center">
									<div class="btn-group">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
</body>
<%@include file="/common/footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>
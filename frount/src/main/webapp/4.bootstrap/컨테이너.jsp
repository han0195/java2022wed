<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="1.설치.jsp" %>
	<div class="conainer">
	
		<div id = "cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="10000">
			
				<div class="carousel-item active">
					<img alt="" src="../CSS/사진1.png">
				</div>
				<div class="carousel-item">
					<img alt="" src="../CSS/사진2.png">
				</div>
				<div class="carousel-item">
					<img alt="" src="../CSS/사진3.png">
				</div>
				
				
				<button type="button" data-bs-target="cs" class="carousel-control-prev"  data-bs-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</button>
				<button type="button" data-bs-target="cs" class="carousel-control-next"  data-bs-slide="next">
					<span class="carousel-control-prev-icon"></span>
				</button>
		</div>
		
	</div>
</body>
</html>
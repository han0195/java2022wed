<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ezen 쇼핑몰</title>
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자정의 css -->
	<link href="/jspweb/css/main.css" rel="stylesheet">
</head>
<body>
	<%
	String mid = (String) session.getAttribute("login");
	if(mid == null){%>
		<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 text-end">
					
					<a class="btn btn-primary" href="/jspweb/main.jsp" role="button">home</a>
					<a class="btn btn-primary" href="/jspweb/member/login.jsp" role="button">로그인</a>
					<a class="btn btn-primary" href="/jspweb/member/signup.jsp"  role="button">회원가입</a>
				
			</div>
			<div class="col-2 text-end"></div>
		</div>
	</div>
	<% }else{ %>
			<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 text-end">
					
					<a class="btn btn-primary" href="/jspweb/main.jsp" role="button">home</a>
					
					<form action="loginout" method="get" style="display: inline-block;">
					<input class="btn btn-primary" type="submit" value="로그아웃">
					</form>				
					
					<a class="btn btn-primary" href="/jspweb/member/signup.jsp"  role="button">회원가입</a>
				
			</div>
			<div class="col-2 text-end"></div>
		</div>
	</div>	
	<%} %>
	<!--   헤더페이지[ 모든 페이지 사용되기 때문에 = 최상위에서 절대경로 ] -->
	
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 js -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	<!-- jquery 최신 cdn -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	

</body>
</html>






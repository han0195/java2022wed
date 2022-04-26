<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="background.jsp" %>
	<div class="col-md-10 offset-2 content"><!-- 본문 -->
		<div class="container col-md-6"><!-- 로그인화면 -->
		
		<div class="text-center"> <h3>LOGIN</h3> </div> <!-- 헤더 -->
		<form action="자바컨트롤에게 전송" method="get" class="form-control">
			<div class="row text text-center"> <!-- 로그인창 -->
				<ul class="col-md-8">
					<li> <input type="text" placeholder="아이디" class="form-control"> </li>
					<li> <input type="text" placeholder="비밀번호" class="form-control"> </li>
				</ul>
				<div class="col-md-4" > <!-- 로그인 버튼 -->
					<button class="form-control" style="height: 76px;">LOGIN</button>
				</div>
			</div>
			<div class="row"><!-- 선택 -->
				<ul class="row">
					<li class="col-md-6 text-center" style="border-right: 1px solid #999999;"> <input type="checkbox">아이디저장 @ 보안접속</li>
					<li class="col-md-3 text-center" style="border-right: 1px solid #999999;"> 아이디찾기 </li>
					<li class="col-md-3 text-center"> 비밀번호찾기 </li>
				</ul>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="text-end">
						<img alt="" src="img/사진1.gif">
						<img alt="" src="img/사진3.gif">
					</div>	
				</div>
				<div class="col-md-6">
					<div class="text-start">
						<img alt="" src="img/사진2.gif">
						<img alt="" src="img/사진4.gif">
					</div>	
				</div>
			</div>
		</form>	
			
		</div>
			
			
		<div><!-- 비회원로그인화면 -->
		
		</div>
	</div> 
</body>
</html>
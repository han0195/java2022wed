<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	
	<%@ include file="../header.jsp" %>
	<div class="container">
		<h3>회원가입페이지</h3>
		<h3>임시아이디: han0195</h3>
		<form>
			아이디: <input type="text" id="mid" placeholder="id">
			<span id="idcheck"></span>	<br>
			비밀번호: <input type="password" id="password" placeholder="password">
			비밀번호체크: <input type="password" id="pwacheck" placeholder="password check">
			<span id="pwcheck"></span>	<br>
			이름: <input type="text" id="mname" placeholder="name">	
			<span id="namecheck"></span>	<br>
			전화번호: <input type="text" id="mphone" placeholder="phone number">
			<span id="mphonecheck"></span>	<br>
			이메일 : <input type="text" id="memail" placeholder="memail">
			<span id="memailcheck"></span>	<br>
			<input type="text" id="sample4_postcode" placeholder="우편번호">
			<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
			<input type="text" id="sample4_roadAddress" placeholder="도로명주소">
			<input type="text" id="sample4_jibunAddress" placeholder="지번주소">
			<span id="guide" style="color:#999;display:none"></span>
			<input type="text" id="sample4_detailAddress" placeholder="상세주소">
			<input type="text" id="sample4_extraAddress" placeholder="참고항목">
			<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
			<button id="in" type="button">가입하기</button>
		</form>
	</div>
	<script src="../js/singup.js" type="text/javascript"></script>
	<%@ include file="../footer.jsp" %>
	
</body>
</html>
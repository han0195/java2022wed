<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<%@include file = "../header.jsp" %>
<div class="container">
	<h3> 회원 페이지 </h3>
	<form id="signupform" action="../signup" method="post">
		아이디 : <input type="text" id="mid" placeholder="user id" name="mid">
		<span id="idcheck"></span> 
		<br>
		비밀번호 : <input type="password" id="mpassword" placeholder="user password" name="mpw"> 
		비밀번호 확인 : <input type="password" id="mpasswordcheck" placeholder="password check">
		<span id="passwordcheck"></span>
		<br>
		이름 <input type="text" id="mname" placeholder="user name" name="mname">
		<span id="namecheck"></span>
		<br>
		연락처 : <input type="text" id="mphone" placeholder="user phone" name="mphone">
		<span id="phonecheck"></span>
		<br>
		이메일 : <input type="text" id="memail" placeholder="user email" name="memail">
		@
		<input type="text" id="memailaddress" name="memailaddress" >
		<select id="emailselect">
			<option value=""> 직접입력 </option>
			<option value="naver.com"> naver.com </option>
			<option value="nate.com"> nate.com </option>
			<option value="daum.com"> daum.com </option>
		</select>
		<span id="emailcheck"></span>
		<br>
			<input type="text" id="sample4_postcode" placeholder="우편번호" name = "address1">
			<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
			<input type="text" id="sample4_roadAddress" placeholder="도로명주소" name = "address2">
			<input type="text" id="sample4_jibunAddress" placeholder="지번주소" name = "address3">
			<span id="guide" style="color:#999;display:none"></span>
			<input type="text" id="sample4_detailAddress" placeholder="상세주소" name = "address4">
		<br>
		<span id="addresscheck"></span>
		<button onclick="signup()" type="button">가입하기</button>
	</form>
</div>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../js/signup.js" type="text/javascript"></script>
<%@include file = "../footer.jsp" %>




</body>
</html>
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
	<form class="form-control" id="signupform" action="../signup" method="post">
		<div class ="row ra">
			<div class = "col-2">아이디 : </div>
			<div class = "col-10"><input class="form-control" type="text" id="mid" placeholder="user id" name="mid"></div>
		</div>
		<div class ="row ra">
			<div class = "col-2"></div>
			<div class = "col-10"><span id="idcheck"></span> </div>
		</div>
		
		<div class ="row ra">
			<div class = "col-2">비밀번호 :</div>
			<div class = "col-10 "> <input class="form-control" type="password " id="mpassword" placeholder="user password" name="mpw"> </div>
		</div>
		<div class ="row ra">
			<div class = "col-2">비밀번호 확인 : </div>
			<div class = "col-10"><input  class="form-control" type="password" id="mpasswordcheck" placeholder="password check"></div>
		</div>
		<div class ="row ra">
			<div class = "col-2"></div>
			<div class = "col-10"><span id="passwordcheck"></span></div>
		</div> 
		<div class ="row ra">
			<div class = "col-2">이름: </div>
			<div class = "col-10">	<input  class="form-control" type="text" id="mname" placeholder="user name" name="mname"></div>
		</div>
		<div class ="row ra">
			<div class = "col-2"></div>
			<div class = "col-10"><span id="namecheck"></span></div>
		</div>
		
		<div class ="row ra">
			<div class = "col-2">연락처 : </div>
			<div class = "col-10"><input  class="form-control" type="text" id="mphone" placeholder="user phone" name="mphone"></div>
		</div>
		
		<div class ="row ra">
			<div class = "col-2"></div>
			<div class = "col-10"><span id="phonecheck"></span></div>
		</div>
		
		<div class ="row ra">
			<div class = "col-2">이메일 : </div>
			<div class = "col-10">
			<input class="col-6 " type="text" id="memail" placeholder=" user email" name="memail">
			@
			<input class="col-2" type="text" id="memailaddress" name="memailaddress" >
			<select id="emailselect">
			<option value=""> 직접입력 </option>
			<option value="naver.com"> naver.com </option>
			<option value="nate.com"> nate.com </option>
			<option value="daum.com"> daum.com </option>
		</select>
			</div>
		</div>
		<div class ="row ra">
			<div class = "col-2"></div>
			<div class = "col-10"><span id="emailcheck"></span></div>
		</div>	
		
		<div class ="row ra">
			<div class = "col-2"></div>
			<div class = "col-10">
				<input type="text" id="sample4_postcode" placeholder="우편번호" name = "address1">
				<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
				<input type="text" id="sample4_roadAddress" placeholder="도로명주소" name = "address2">
				<input type="text" id="sample4_jibunAddress" placeholder="지번주소" name = "address3">
				<span id="guide" style="color:#999;display:none"></span>
				<input type="text" id="sample4_detailAddress" placeholder="상세주소" name = "address4">
			</div>
			<span id="addresscheck"></span>
		</div>	
	
							
		
		<br>
			<div class="row">
				<button class="btn btn-primary" onclick="signup()" type="button">가입하기</button>
			</div>
				
	
	</form>
</div>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../js/signup.js" type="text/javascript"></script>
<%@include file = "../footer.jsp" %>




</body>
</html>
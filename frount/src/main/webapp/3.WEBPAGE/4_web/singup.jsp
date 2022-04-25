<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.a input {height: 52px;}
	input{
  	background-color: red; color: red;/*The color of your choice here*/
	}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<%@ include file="header.jsp" %>
	<br><br><br><br><br><br><br><br><br><br><br><br>
	<div class="container">
		<form action="자바컨트롤에게 전송" method="get" class="form-control">
			<div class="row">
				<div class="col-md-6" style="border: 1px solid #eeeeee;">
					<div style="margin-bottom: 10px; border-bottom: 1px solid #eeeeee; "> <span style=" display:inline-block; font-weight: bold; margin-bottom: 5px;">회원가입 및 정사적인 서비스 이요을 위해 아래 약관을 읽어 보시고, 동의 여부를 결정해 주세요</span>
						필수 약관을 동의 하셔야 회원가입이 가능합니다.
					</div>
					<div>
						<h3>회원가입 약관동의<span style="color: red">*</span></h3>
					</div>
					<textarea rows="8" cols="" class="col-md-12" readonly="readonly">
제 1장 총칙
제 1 조(목적)
						
본 약관은 국가공간정보포털 웹사이트(이하 "국가공간정보포털")가 제공하는 모든 서비스(이하 "서비스")의 이용조건 및 절차, 회원과 국가공간정보포털의 권리, 의무, 책임사항과 기타 필요한 사항을 규정함을 목적으로 합니다.
						
제 2 조(약관의 효력과 변경)
						
1. 국가공간정보포털은 이용자가 본 약관 내용에 동의하는 경우, 국가공간정보포털의 서비스 제공 행위 및 회원의 서비스 사용 행위에 본 약관이 우선적으로 적용됩니다.
2. 국가공간정보포털은 약관을 개정할 경우, 적용일자 및 개정사유를 명시하여 현행약관과 함께 국가공간정보포털의 초기화면에 그 적용일 7일 이전부터 적용 전일까지 공지합니다. 단, 회원에 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다. 이 경우 국가공간정보포털은 개정 전 내용과 개정 후 내용을 명확하게 비교하여 회원이 알기 쉽도록 표시합니다.
3. 변경된 약관은 국가공간정보포털 홈페이지에 공지하거나 e-mail을 통해 회원에게 공지하며, 약관의 부칙에 명시된 날부터 그 효력이 발생됩니다. 회원이 변경된 약관에 동의하지 않는 경우, 회원은 본인의 회원등록을 취소(회원탈퇴)할 수 있으며, 변경된 약관의 효력 발생일로부터 7일 이내에 거부의사를 표시하지 아니하고 서비스를 계속 사용할 경우는 약관 변경에 대한 동의로 간주됩니다.
					</textarea>
					<div style="margin-bottom: 10px; border-bottom: 1px solid #eeeeee; padding-bottom: 20px;" ><input type="checkbox"> 회원가입 약관 동의 합니다.</span></div> 
					<div>
						<h3>개인정보처리방침<span style="color: red">*</span></h3>
					</div>
					<textarea rows="8" cols="" class="col-md-12" readonly="readonly">
제 1장 총칙
제 1 조(목적)
						
본 약관은 국가공간정보포털 웹사이트(이하 "국가공간정보포털")가 제공하는 모든 서비스(이하 "서비스")의 이용조건 및 절차, 회원과 국가공간정보포털의 권리, 의무, 책임사항과 기타 필요한 사항을 규정함을 목적으로 합니다.
						
제 2 조(약관의 효력과 변경)
						
1. 국가공간정보포털은 이용자가 본 약관 내용에 동의하는 경우, 국가공간정보포털의 서비스 제공 행위 및 회원의 서비스 사용 행위에 본 약관이 우선적으로 적용됩니다.
2. 국가공간정보포털은 약관을 개정할 경우, 적용일자 및 개정사유를 명시하여 현행약관과 함께 국가공간정보포털의 초기화면에 그 적용일 7일 이전부터 적용 전일까지 공지합니다. 단, 회원에 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다. 이 경우 국가공간정보포털은 개정 전 내용과 개정 후 내용을 명확하게 비교하여 회원이 알기 쉽도록 표시합니다.
3. 변경된 약관은 국가공간정보포털 홈페이지에 공지하거나 e-mail을 통해 회원에게 공지하며, 약관의 부칙에 명시된 날부터 그 효력이 발생됩니다. 회원이 변경된 약관에 동의하지 않는 경우, 회원은 본인의 회원등록을 취소(회원탈퇴)할 수 있으며, 변경된 약관의 효력 발생일로부터 7일 이내에 거부의사를 표시하지 아니하고 서비스를 계속 사용할 경우는 약관 변경에 대한 동의로 간주됩니다.
					</textarea>
					<div style="margin-bottom: 10px; padding-bottom: 20px;"><input type="checkbox"> 개인정보처리 약관 동의 합니다.</div> 
				</div>		
				
				<div class="col-md-6 a">
					<input type="text" id = "floatingInput" value="아이디를 입력하세요.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="비밀번호를 입력하세요.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="한번더 비밀번호를 입력하세요.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="이름을 입력하세요.*" class="form-control" style="margin-bottom: 10px;">
					<div class="text-center"><input type="radio" style="height:14px; ">남자 <input type="radio" style="height:14px;">여자</div> 
					<input type="text" value="연락처를 입력하세요.*" class="form-control" style="margin-bottom: 10px; margin-top: 10px;">
					<input type="text" value="이메일을 입력하세요.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="나이를 입력하세요.*" class="form-control" style="margin-bottom: 10px;">
					
					<div class="row" style="margin-bottom: 10px;">
						<div class="col-md-4 ">
							주소<span style="color: red;">*</span>
						</div>
						<div class="col-md-4">
							<input type="text" placeholder="우편번호" class="form-control">
						</div>
						<div class="col-md-4">
							<button class="form-control" style="height: 52px;">우편번호 찾기</button>
						</div>
					</div>
					
					<div class="row" style="margin-bottom: 10px;">
						<div class="col-md-4 ">
						</div>
						<div class="col-md-4 ">
							<input type="text" placeholder="도로명주소" class="form-control">
						</div>
						<div class="col-md-4">
							<input type="text" placeholder="지번주소" class="form-control">
						</div>
					</div>
					<div class="row" style="margin-bottom: 10px;">
						<div class="col-md-4">						
						</div>
						<div class="col-md-8">
							<input type="text" placeholder="상세주소" class="form-control">
						</div>
					</div>
						
				
					<button type="submit" class="form-control">회원가입</button>
				</div>
			</div>						
		</form>
	</div>
	
	<%@ include file="footer.jsp" %>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	#main {
		width: 1200px;
		height: 500px;
		margin: 0 auto;
	}
	.topimg{
		float: left;
		margin-right: 50px; 
	}
	.toptext{
		float: left;
	}
	.toptext h4{
		margin-top: 7px;'
		margin-bottom: 2px;
	}
	.toptext p{
		margin-top: 0px;
	}
	#maintop1 , #maintop2{
		height: 120px;
	}
	#maintop{ display: -webkit-box; margin-bottom: 50px; margin-top: 30px;}
	#maintop1{
		float: left;
		margin-right: 50px;
	}
	#maintop2{
		float: left;
	}
	#toptext{
		
	}
	#mainbuttom div{
		float: left;
		margin: 0px; 
	}
	li{
		list-style: none;
	}
	ul {
		padding-left: 0px;
	} 
	#mainbuttom h4{
		margin-top: 10px;
		margin-bottom: 10px;
	}
</style>
</head>
<body>
	<div id = "main">
		<div id = "maintop">
			<div id = "maintop1">
				<div class = "topimg"> <img alt="" src="img/icon1.png"> </div>
				<div class = "toptext"> 
					<h4>예약 안내</h4> 
					<p>스튜디오 대여는 사전에 인터넷 예약을 하셔야 합니다.<br>
					예약은 1일 이전까지 가능합니다.</p> 
				</div>
			</div>
			
			<div id = "maintop2">
				<div class = "topimg"> <img alt="" src="img/icon2.png"> </div>
				<div class = "toptext"> 
					<h4>포토 갤러리</h4> 
					<p>취업사진, 가족 사진, 프로필 사진, 명함 사진등 개인또는<br> 만처가 이룰할 수 있습니다.</p> 
				</div>
			</div>
		</div>
		
		<div id = "mainbuttom">
			<div>
				<ul>
					<li> <img alt="" src="img/image1.jpg" width="290px;"> </li>
					<li> <h4>촬영 스튜디오</h4> </li>
					<li> 카메라, 조명 등 활영 장비 완비 </li>
				</ul>
			</div>
			<div>
				<ul>
					<li> <img alt="" src="img/image2.jpg" width="290px;"> </li>
					<li> <h4>촬영 스튜디오</h4> </li>
					<li> 카메라, 조명 등 활영 장비 완비 </li>
				</ul>
			</div>
			<div>
				<ul>
					<li> <img alt="" src="img/image3.jpg" width="290px;"> </li>
					<li> <h4>촬영 스튜디오</h4> </li>
					<li> 카메라, 조명 등 활영 장비 완비 </li>
				</ul>
			</div>
			<div>
				<ul>
					<li> <img alt="" src="img/image4.jpg" width="290px;"> </li>
					<li> <h4>촬영 스튜디오</h4> </li>
					<li> 카메라, 조명 등 활영 장비 완비 </li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
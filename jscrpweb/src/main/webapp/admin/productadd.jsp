<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 제품 등록 페이지 </h3>
	<!-- 폼에서 첨부파일 전송시에는 enctype : "multipart/form-data" -->
	<form action="productadd" method="post" enctype="multipart/form-data">
		제품명 <input type="text" id="pname" name="pname" placeholder="제품명"> <br>
		가격  <input type="text" id="pprice" name="pprice" placeholder="가격"> <br>
		할인율 <input type="text" id="pdiscount" name="pdiscount" placeholder="할인율"> <br>
		카테고리
			<button onclick="categorybtn()" type="button" >
				카테고리추가
			</button> 
		<br>
		
		<div id="categoryinput"> <!-- 버튼 클릭시 카테고리 입력창 표시되는 구역 -->
			
		</div>
		
		<div id="categorybox"> <!-- DB내 카테고리 개수만큼 radio 버튼이 표시되는 구역 -->
			* DB에 저장된 카테고리 만큼 버튼 표시 [ DB -> JAVA(서블릿) -> JS -> HTML ]
		</div>
		대표이미지 <input type="file" id="pimg" name="pimg"> <br>
		<input type="submit" value="등록">
		<input type="reset" value="초기화">
	</form>
	
	<!-- 사용자정의 js 호출 --> <script src="/jspweb/js/productadd.js" type="text/javascript"></script>
	
</body>
</html>









<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp"%>
		<br><br><br><br><br><br><br><br><br><br>
		<div class="container">
		
			<h3 class="text-center">문의 글쓰기</h3>
			<div style="border-bottom: solid 3px orange; width: 200px; margin: 0 auto;"></div>
			
			<form action="자바컨트롤에게 전송" method="get" class="form-control">
				<div class="row">
					<div class="col-md-3">
						작성자: <input type="text" class="form-control">	
					</div>
					<div class="col-md-3">						
						비밀번호: <input type="password" class="form-control">
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						제목: <input type="text" placeholder="문의 제목을 작성해주세요" maxlength="50" class="form-control">		
					</div>
				</div>	
				내용: <textarea rows="20" cols="" class="form-control" placeholder="문의내용작성"></textarea> 					 	
			 	<div class="row">
				 	<div class="col-md-3">
				 		첨부파일: <input type="file" class="form-control">
				 	</div>
			 	</div>	
			 	<div class="row offset-4-row">
			 		<div class="col-md-4">
			 			<input type="submit" value="등록" class="form-control"> <!-- 폼 전송( action -> )버튼 -->
			 		</div>
			 		<div class="col-md-4">
			 			<input type="reset" value="다시쓰기" class="form-control"> <!-- 폼 전송( action -> )버튼 -->
			 		</div>
			 		<div class="col-md-4">
			 			<a><button class="form-control">목록</button></a>
			 		</div>
			 	</div>			 	
			</form>
			
			
		</div>
		
	<%@include file="footer.jsp"%>

</body>
</html>
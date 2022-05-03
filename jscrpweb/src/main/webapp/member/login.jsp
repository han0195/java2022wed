<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file = "../header.jsp" %>
	<br>
	
	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8">
				<h3>로그인페이지</h3>
				<form class="form-control"  action="../login" method="post">
				<input class="form-control logininput" type="text" name = "mid" placeholder="id입력">
				<input class="form-control logininput" type="password" name = "mpassword" placeholder="pw입력">
				<input class="form-control logininput" type="submit" value="로그인">
					<% 
						String result = request.getParameter("result");
						if(result != null && result.equals("2")){%>
							<span>존재하는 회원정보가 없습니다</span>
					<%}%>
				</form>
			</div>
			<div class="col-2"></div>
		</div>
		
		
	</div>
	
	
	<%@include file = "../footer.jsp" %>

</body>
</html>
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
		
			<h3 class="text-center">���� �۾���</h3>
			<div style="border-bottom: solid 3px orange; width: 200px; margin: 0 auto;"></div>
			
			<form action="�ڹ���Ʈ�ѿ��� ����" method="get" class="form-control">
				<div class="row">
					<div class="col-md-3">
						�ۼ���: <input type="text" class="form-control">	
					</div>
					<div class="col-md-3">						
						��й�ȣ: <input type="password" class="form-control">
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						����: <input type="text" placeholder="���� ������ �ۼ����ּ���" maxlength="50" class="form-control">		
					</div>
				</div>	
				����: <textarea rows="20" cols="" class="form-control" placeholder="���ǳ����ۼ�"></textarea> 					 	
			 	<div class="row">
				 	<div class="col-md-3">
				 		÷������: <input type="file" class="form-control">
				 	</div>
			 	</div>	
			 	<div class="row offset-4-row">
			 		<div class="col-md-4">
			 			<input type="submit" value="���" class="form-control"> <!-- �� ����( action -> )��ư -->
			 		</div>
			 		<div class="col-md-4">
			 			<input type="reset" value="�ٽþ���" class="form-control"> <!-- �� ����( action -> )��ư -->
			 		</div>
			 		<div class="col-md-4">
			 			<a><button class="form-control">���</button></a>
			 		</div>
			 	</div>			 	
			</form>
			
			
		</div>
		
	<%@include file="footer.jsp"%>

</body>
</html>
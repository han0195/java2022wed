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
	<div class="col-md-10 offset-2 content"><!-- ���� -->
		<div class="container col-md-6"><!-- �α���ȭ�� -->
		
		<div class="text-center"> <h3>LOGIN</h3> </div> <!-- ��� -->
		<form action="�ڹ���Ʈ�ѿ��� ����" method="get" class="form-control">
			<div class="row text text-center"> <!-- �α���â -->
				<ul class="col-md-8">
					<li> <input type="text" placeholder="���̵�" class="form-control"> </li>
					<li> <input type="text" placeholder="��й�ȣ" class="form-control"> </li>
				</ul>
				<div class="col-md-4" > <!-- �α��� ��ư -->
					<button class="form-control" style="height: 76px;">LOGIN</button>
				</div>
			</div>
			<div class="row"><!-- ���� -->
				<ul class="row">
					<li class="col-md-6 text-center" style="border-right: 1px solid #999999;"> <input type="checkbox">���̵����� @ ��������</li>
					<li class="col-md-3 text-center" style="border-right: 1px solid #999999;"> ���̵�ã�� </li>
					<li class="col-md-3 text-center"> ��й�ȣã�� </li>
				</ul>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="text-end">
						<img alt="" src="img/����1.gif">
						<img alt="" src="img/����3.gif">
					</div>	
				</div>
				<div class="col-md-6">
					<div class="text-start">
						<img alt="" src="img/����2.gif">
						<img alt="" src="img/����4.gif">
					</div>	
				</div>
			</div>
		</form>	
			
		</div>
			
			
		<div><!-- ��ȸ���α���ȭ�� -->
		
		</div>
	</div> 
</body>
</html>
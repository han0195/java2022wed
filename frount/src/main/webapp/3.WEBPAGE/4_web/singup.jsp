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
		<form action="�ڹ���Ʈ�ѿ��� ����" method="get" class="form-control">
			<div class="row">
				<div class="col-md-6" style="border: 1px solid #eeeeee;">
					<div style="margin-bottom: 10px; border-bottom: 1px solid #eeeeee; "> <span style=" display:inline-block; font-weight: bold; margin-bottom: 5px;">ȸ������ �� �������� ���� �̿��� ���� �Ʒ� ����� �о� ���ð�, ���� ���θ� ������ �ּ���</span>
						�ʼ� ����� ���� �ϼž� ȸ�������� �����մϴ�.
					</div>
					<div>
						<h3>ȸ������ �������<span style="color: red">*</span></h3>
					</div>
					<textarea rows="8" cols="" class="col-md-12" readonly="readonly">
�� 1�� ��Ģ
�� 1 ��(����)
						
�� ����� ���������������� ������Ʈ(���� "����������������")�� �����ϴ� ��� ����(���� "����")�� �̿����� �� ����, ȸ���� ������������������ �Ǹ�, �ǹ�, å�ӻ��װ� ��Ÿ �ʿ��� ������ �������� �������� �մϴ�.
						
�� 2 ��(����� ȿ�°� ����)
						
1. ������������������ �̿��ڰ� �� ��� ���뿡 �����ϴ� ���, ������������������ ���� ���� ���� �� ȸ���� ���� ��� ������ �� ����� �켱������ ����˴ϴ�.
2. ������������������ ����� ������ ���, �������� �� ���������� ����Ͽ� �������� �Բ� ������������������ �ʱ�ȭ�鿡 �� ������ 7�� �������� ���� ���ϱ��� �����մϴ�. ��, ȸ���� �Ҹ��ϰ� ��������� �����ϴ� ��쿡�� �ּ��� 30�� �̻��� ���� �����Ⱓ�� �ΰ� �����մϴ�. �� ��� ������������������ ���� �� ����� ���� �� ������ ��Ȯ�ϰ� ���Ͽ� ȸ���� �˱� ������ ǥ���մϴ�.
3. ����� ����� ���������������� Ȩ�������� �����ϰų� e-mail�� ���� ȸ������ �����ϸ�, ����� ��Ģ�� ��õ� ������ �� ȿ���� �߻��˴ϴ�. ȸ���� ����� ����� �������� �ʴ� ���, ȸ���� ������ ȸ������� ���(ȸ��Ż��)�� �� ������, ����� ����� ȿ�� �߻��Ϸκ��� 7�� �̳��� �ź��ǻ縦 ǥ������ �ƴ��ϰ� ���񽺸� ��� ����� ���� ��� ���濡 ���� ���Ƿ� ���ֵ˴ϴ�.
					</textarea>
					<div style="margin-bottom: 10px; border-bottom: 1px solid #eeeeee; padding-bottom: 20px;" ><input type="checkbox"> ȸ������ ��� ���� �մϴ�.</span></div> 
					<div>
						<h3>��������ó����ħ<span style="color: red">*</span></h3>
					</div>
					<textarea rows="8" cols="" class="col-md-12" readonly="readonly">
�� 1�� ��Ģ
�� 1 ��(����)
						
�� ����� ���������������� ������Ʈ(���� "����������������")�� �����ϴ� ��� ����(���� "����")�� �̿����� �� ����, ȸ���� ������������������ �Ǹ�, �ǹ�, å�ӻ��װ� ��Ÿ �ʿ��� ������ �������� �������� �մϴ�.
						
�� 2 ��(����� ȿ�°� ����)
						
1. ������������������ �̿��ڰ� �� ��� ���뿡 �����ϴ� ���, ������������������ ���� ���� ���� �� ȸ���� ���� ��� ������ �� ����� �켱������ ����˴ϴ�.
2. ������������������ ����� ������ ���, �������� �� ���������� ����Ͽ� �������� �Բ� ������������������ �ʱ�ȭ�鿡 �� ������ 7�� �������� ���� ���ϱ��� �����մϴ�. ��, ȸ���� �Ҹ��ϰ� ��������� �����ϴ� ��쿡�� �ּ��� 30�� �̻��� ���� �����Ⱓ�� �ΰ� �����մϴ�. �� ��� ������������������ ���� �� ����� ���� �� ������ ��Ȯ�ϰ� ���Ͽ� ȸ���� �˱� ������ ǥ���մϴ�.
3. ����� ����� ���������������� Ȩ�������� �����ϰų� e-mail�� ���� ȸ������ �����ϸ�, ����� ��Ģ�� ��õ� ������ �� ȿ���� �߻��˴ϴ�. ȸ���� ����� ����� �������� �ʴ� ���, ȸ���� ������ ȸ������� ���(ȸ��Ż��)�� �� ������, ����� ����� ȿ�� �߻��Ϸκ��� 7�� �̳��� �ź��ǻ縦 ǥ������ �ƴ��ϰ� ���񽺸� ��� ����� ���� ��� ���濡 ���� ���Ƿ� ���ֵ˴ϴ�.
					</textarea>
					<div style="margin-bottom: 10px; padding-bottom: 20px;"><input type="checkbox"> ��������ó�� ��� ���� �մϴ�.</div> 
				</div>		
				
				<div class="col-md-6 a">
					<input type="text" id = "floatingInput" value="���̵� �Է��ϼ���.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="��й�ȣ�� �Է��ϼ���.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="�ѹ��� ��й�ȣ�� �Է��ϼ���.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="�̸��� �Է��ϼ���.*" class="form-control" style="margin-bottom: 10px;">
					<div class="text-center"><input type="radio" style="height:14px; ">���� <input type="radio" style="height:14px;">����</div> 
					<input type="text" value="����ó�� �Է��ϼ���.*" class="form-control" style="margin-bottom: 10px; margin-top: 10px;">
					<input type="text" value="�̸����� �Է��ϼ���.*" class="form-control" style="margin-bottom: 10px;">
					<input type="text" value="���̸� �Է��ϼ���.*" class="form-control" style="margin-bottom: 10px;">
					
					<div class="row" style="margin-bottom: 10px;">
						<div class="col-md-4 ">
							�ּ�<span style="color: red;">*</span>
						</div>
						<div class="col-md-4">
							<input type="text" placeholder="�����ȣ" class="form-control">
						</div>
						<div class="col-md-4">
							<button class="form-control" style="height: 52px;">�����ȣ ã��</button>
						</div>
					</div>
					
					<div class="row" style="margin-bottom: 10px;">
						<div class="col-md-4 ">
						</div>
						<div class="col-md-4 ">
							<input type="text" placeholder="���θ��ּ�" class="form-control">
						</div>
						<div class="col-md-4">
							<input type="text" placeholder="�����ּ�" class="form-control">
						</div>
					</div>
					<div class="row" style="margin-bottom: 10px;">
						<div class="col-md-4">						
						</div>
						<div class="col-md-8">
							<input type="text" placeholder="���ּ�" class="form-control">
						</div>
					</div>
						
				
					<button type="submit" class="form-control">ȸ������</button>
				</div>
			</div>						
		</form>
	</div>
	
	<%@ include file="footer.jsp" %>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
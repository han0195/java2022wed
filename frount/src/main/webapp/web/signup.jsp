<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		
		#ho{
			margin : 150px;
		}
		h3{ text-align: center;}
		li{ list-style-type: none; }/* �۸Ӹ� ���� */
		#join{
			width: 600px;
			margin: 0 auto; /* ��� ���� */
			border-top: solid 2px #555555;
			border-bottom: solid 2px #555555;
			padding: 30px;
		}
		.cols{ padding: 5px; }
		.cols li{ display: inline-block; }
		.col1{ width: 150px; }
		.col2 input { width: 200px; height: 30px; } 
		.email input , select  { height: 30px; }
		.hello{ vertical-align: top; } /* �ؽ�Ʈ �������� */
		#bb{
			margin-left:600px;
			
		}
	</style>

</head>
<body>


<%@include file="header.jsp"%>
<%@include file="mainimg.jsp"%>
<div id = "ho">

<h3>ȸ������</h3>
<form>
	<ul id = "join">
	<li>
		<ul class = "cols">
			<li class = "col1">���̵�</li>
			<li class = "col2"><input type="text"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">��й�ȣ</li>
			<li class = "col2"><input type="password"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">��й�ȣ Ȯ��</li>
			<li class = "col2"><input type="password"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">�̸�</li>
			<li class = "col2"><input type="text"></li>
			
		</ul>
	</li>
	<li>
		<ul class = "cols">
			<li class = "col1">�̸���</li>
			<li class = "col2"><input type="text">@
			<select>
				<option> �����Է� </option>
				<option> nanver.com </option>
				<option> nate.com </option>
			</select>
			</li>
		</ul>
	</li>
	
	<li>
		<ul class = "cols">
			<li class = "col1">�̸��� ����</li>
			<li><input type = "radio" name = "ch" checked="checked"> ����� <input type = "radio" name = "ch"> ����</li>
		</ul>
	</li>
	
	<li>
		<ul class = "cols">
			<li class = "col1">�̸��� ����</li>
			<li ><input type = "checkbox"> ģ����õ <input type = "checkbox" > ���ͳݰ˻�<input type = "checkbox" checked="checked"> ��Ÿ
		</ul>
	</li>
	
	<li>
		<ul class = "cols">
			<li class = "col1 hello"> �λ縻 </li>
			<li class = "col2 "><textarea rows="6" cols="40"></textarea></li>
		</ul>
	</li>
	
	</ul>
	
	

</form>
<ul>
	<li id ="bb">
		<input type = "submit" value = "�����ϱ�"> <input type = "reset" value = "����ϱ�">
	</li>
</ul>
</div>


<%@include file="footer.jsp"%>

</body>
</html>
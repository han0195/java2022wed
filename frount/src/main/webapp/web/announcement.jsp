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
		#contents{
			width: 1150px;
			margin: 0 auto;
		}
		#title{
			width: 100px;
			margin: 0 auto;
			font-size: 20px;
			margin-bottom: 60px;
		}
		#search_ho{
			width: 1000px;margin: 0 auto;
			background-color: #f9f7f9; height : 60px;
		}
		#search{
			width: 650px;
			margin: 0 auto;
			margin-bottom: 20px;	
			padding-bottom: 20px; 
		}
		#search input{
			width: 500px;
			height: 40px; 
		}
		#search button {
			width: 100px;
			height: 42px;
			background-color: #555555;
			color: white;
		}
		table{
			margin : 0 auto;
			border-top: solid 1px #cccccc;
			border-bottom: solid 1px #cccccc;
			font-size: 15px;
		}
		th{text-align: center; padding: 10px 50px;}
		td{
			padding: 10px 100px;
			border-top: solid 1px #e7e7e7;
		}
		#con{}
	</style>
</head>
<body>
<%@include file="header.jsp"%>
<%@include file="mainimg.jsp"%>
<div id="ho">
	<form>

	<div id="contents">
		<div id="title"> <h3>��������</h3> </div>
		<div id = "search_ho">
			<div id="search"><input type="text" placeholder="�˻�� �Է����ּ���."><button>�˻�</button> </div>
		</div>
		
		<div>
			<table>
				<tbody><tr>
					<th>��ȣ</th> <th>����</th> <th>�����</th>
				</tr>
				<tr id="con">
					<td>3</td> <td>[��������] �������� ó����ħ ����ȳ�ó����ħ</td> <td>2017.07.13</td>
				</tr>
				<tr id="con">
					<td>2</td> <td>�������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�</td> <td>2017.06.15</td>
				</tr>
				<tr id="con">
					<td>1</td> <td>�������� �ȳ��Դϴ�. �̿����ּż� �����մϴ�</td> <td>2017.06.15</td>
				</tr>
			</tbody></table>
		</div>
		
	</div>
	</form>
</div>
<%@include file="footer.jsp"%>

</body>
</html>
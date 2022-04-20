<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		li { list-style: none;}
		#header{height: 200px;		}
		#box{ width: 1100px; margin: 0 auto;}
		#logo { float: left; margin: 50px 0px 0px 50px;}
		#menus{ float: right; text-align: right;}
		#menus li { display: inline;}
		
		@font-face {
    	font-family: 'Yeongdo-Rg';
    	src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2202-2@1.0/Yeongdo-Rg.woff') format('woff');
    	font-weight: normal;
    	font-style: normal;
    	}
    	#top_menu{ margin:  30px 0px;}
    	
    	#main_menu li{ 
    		font-family: Yeongdo-Rg;
    		font-size: 20px;
    		margin: 50px 0 0 100px;
    	}
    	
  

	</style>
</head>
<body>
	<div id = "header"><!-- ��� ��ü -->
		<div id ="box"><!-- ��� �ڽ��� -->
			<div id = "logo"> <img alt="" src="img/logo.png"> </div><!-- �ΰ� -->
			<div id = "menus">
				<ul id = "top_menu"><!-- ��ܸ޴� -->
					<li> �������� | </li>
					<li> <a>�α׾ƿ� | </a> </li>
					<li> <a>��������</a></li>
				</ul>
				<ul id = "main_menu"><!-- �ϴܸ޴� -->
					<li> <a href="index.jsp">Home</a> </li>
					<li> <a>�⼮��</a> </li>
					<li> <a href="golley.jsp">��ǰ������</a> </li>
					<li> <a>�Խ���</a> </li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
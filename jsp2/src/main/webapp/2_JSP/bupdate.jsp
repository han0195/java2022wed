<%@page import="dao.Memberdao"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String bno = request.getParameter("bno");
		session.setAttribute("bno", bno);
	%>	
	
	<form action="bupdatecontroller.jsp" method="get">
		
		<input type="text" name="retitle">
		<textarea rows="5" cols="10" name="recontent"></textarea>
		<input type="submit"  value="수정">
	</form>
	
</body>
</html>
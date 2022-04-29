<%@page import="dao.Memberdao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
int bno = Integer.parseInt((String)session.getAttribute("bno"));

String title = request.getParameter("retitle");

String content = request.getParameter("recontent");

Date now = new Date(); // 현재 시스템 시간
SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd"); // 날짜 포멧
String date = sf.format(now); // 현재 날짜.시간 포멧양식의 맞춰 String 변환
// 작성자는 로그인성공시 세션에서 가져오기
// 세션 호출시 기본자료형이 object -> 형변환(1.자동형변환 2.강제형변환)

Memberdao memberdao = new Memberdao();
boolean pass = memberdao.updata(bno, title, content, date);
if(pass){
	response.sendRedirect("main.jsp");
}
%>
<%= bno %>
</body>
</html>
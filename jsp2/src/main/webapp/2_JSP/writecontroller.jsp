<%@page import="dao.Memberdao"%>
<%@page import="dto.Board"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8"); //	요청시 데이터 인코딩 타입 설정
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = (String) session.getAttribute("loginid");
	Date now = new Date(); // 현재 시스템 시간
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd"); // 날짜 포멧
	String date = sf.format(now); // 현재 날짜.시간 포멧양식의 맞춰 String 변환
		// 작성자는 로그인성공시 세션에서 가져오기
		// 세션 호출시 기본자료형이 object -> 형변환(1.자동형변환 2.강제형변환)
	// dto 객체화
	Board board = new Board(0, title, content, writer, date);
		
	// dao
	Memberdao memberdao = new Memberdao();
	boolean pass = memberdao.write(board);
	if(pass){
		response.sendRedirect("main.jsp");
	}else {
		response.sendRedirect("main.jsp");
	}


%>
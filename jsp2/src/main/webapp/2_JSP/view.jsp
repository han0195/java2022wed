<%@page import="dto.Board"%>
<%@page import="dao.Memberdao"%>
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
		int bno = Integer.parseInt(request.getParameter("bno"));
		// 링크에서 선택한 게시물 가져오기
		Memberdao memberdao = new Memberdao();
		Board board = memberdao.get(bno);
		// 만약 로그인된 정보와 작성가가 동일할경우 삭제/수정 필요
		String id = (String) session.getAttribute("loginid");
		if(id != null && id.equals(board.getWriter())){%>
			<a href="bupdate.jsp?bno=<%=bno%>">수정</a>
			<a href="bdelete.jsp?bno=<%=bno%>">삭제</a>
		<%}%>
	<a href="main.jsp">목록보기</a>
	

	<div> 제목: <%= board.getTitle() %></div>
	<div> 작성자: <%= board.getWriter() %></div>
	<div> 작성일: <%= board.getDate() %></div>
	<div> 내용: <%= board.getContent() %></div>

	
</body>
</html>
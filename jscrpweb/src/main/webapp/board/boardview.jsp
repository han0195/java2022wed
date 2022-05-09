<%@page import="dao.MemberDao"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<div class="container">
		<h3>게시판 상세</h3>
		<%
		int bno = Integer.parseInt(request.getParameter("bno"));
		Board board = BoardDao.getBoardDao().getboard(bno);
		String mid = (String)session.getAttribute("login"); 
		if(board.getMno() == MemberDao.getmemberDao().getmno(mid)){%>
				<a href="delet?bno=<%= board.getBno()%>"> 삭제 </a>
				<a href="update.jsp?bno=<%= board.getBno()%>"> 수정 </a>
		<% } %>
		<a href="boardlist.jsp"> 목록 </a>
	

		<table>

			<tr>
				<td>제목</td>
				<td><%=board.getBtitle()%></td>
				<td>작성자</td>
				<td><%=board.getMid()%></td>
				<td>작성일</td>
				<td><%=board.getBdate()%></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><%=board.getBcontent()%></td>
			</tr>
			<tr>
				<td>첨부파일</td>
				<%if(board.getBfile() == null){%>
				<td> 없어요</td>
				<% }else{ %>
				<td><a href="filedown?bfile=<%=board.getBfile()%>"> <%=board.getBfile()%></a>	</td>
				<% } %>
			</tr>

		</table>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>
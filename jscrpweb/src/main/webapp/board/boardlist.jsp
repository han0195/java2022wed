<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	
	<%@include file ="../header.jsp" %>

	<div class="container">
		<h3> 자유게시판 </h3>
		
		<a href="boardwrite.jsp"> 글쓰기 </a>
		
		<table class="table"> <!-- 테이블 -->
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th> 작성자 </th> 
				<th> 조회수  </th> <th> 작성일 </th> 
			</tr>
			<!-- for 문 -->
			<%
				// 1. 모든 게시물  호출 
				ArrayList<Board> boardlist = 
					BoardDao.getBoardDao().getboardlist();
			
				 for( Board board : boardlist ){
					 board.setMid(MemberDao.getmemberDao().getmid(board.getMno()));
			%>
				<tr>
					<td> <%=board.getBno() %> </td>
					<td> <a href="#" style="text-decoration: none;"><%=board.getBtitle() %></a></td>
					<%if(board.getMid() == null){%>
					<td> 비회원 </td>
					<% }else{ %>
					<td> <%=board.getMid() %> </td>
					<%} %>
					<td> <%=board.getBview() %> </td>
					<%
					String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					String olddatea = board.getBdate();
					String lsfo = olddatea.split(" ")[0];
					String timd =  olddatea.split(" ")[1];
					if(lsfo.equals(formatDate)){%>
					<td> <%= timd%> </td>
					<% }else{ %>
					<td> <%=board.getBdate() %> </td>
					<%} %>			
				</tr>
			<%
				}
			%>
			
		</table>
	</div>
	<%@include file ="../footer.jsp" %>

</body>
</html>
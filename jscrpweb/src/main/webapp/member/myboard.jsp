<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
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
	ArrayList<Board> list = BoardDao.getBoardDao().getboardlist();
	System.out.println(list);
	String mid =(String) session.getAttribute("login");
	int mno = MemberDao.getmemberDao().getmno(mid);
	%>
	<%@include file="../header.jsp"%>
	<div class="container">
		<!-- 박스권 -->
		<div class="row">
			<!-- 가로배치 -->
			<div class="col-md-3">
				<!-- 사이드바 -->
				<%@include file="infosidebar.jsp"%>
			</div>
			<div class="col-md-9">
				<!-- 본문 -->
				<h3>내가쓴글</h3>
				<table class="table">
					<!-- 테이블 -->
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>작성일</th>
					</tr>
					<%for(Board temp : list){
						if(temp.getMno() == mno){%>
						<tr>
							<td> <%= temp.getMno() %> </td>
							<td> <%= temp.getBtitle() %> </td>
							<td> <%=mid %> </td>
							<td> <%= temp.getBview() %> </td>
							<td> <%= temp.getBdate() %> </td>
						</tr>		
						<%}
					} %>
				</table>
			</div>
		</div>
	</div>
	<%@include file="../footer.jsp"%>
</body>
</html>
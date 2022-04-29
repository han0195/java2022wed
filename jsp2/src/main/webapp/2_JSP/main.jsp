<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
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
	<h3>회원제 방문록</h3>
	<a href="signup.jsp"><button>회원가입</button></a>
	<%
	String id = (String) session.getAttribute("loginid");
	if (id != null) {// 로그인 되어있는 상태
	%>
	<div><%= id %>님 안녕하세요</div>
	<a href="write.jsp"><button>글쓰기</button></a>
	<a href="loginout.jsp"><button>로그아웃</button></a>
	<a href="memberdelete.jsp"><button>회원탈퇴</button></a>
	<%
	} else {
	%>// 로그인
	<form action="logincontroller.jsp">
		<input type="text" name="id"> <input type="password"
			name="password"> <input type="submit" value="로그인">
	</form>

	<%
	}
	%>

	<table>
		<tr>
			<th>번호</th>
			<th>작성일</th>
			<th>작성자</th>
			<th>제목</th>
			<th>내용</th>
		</tr>

		<!-- 반복문 -->
		<%
			Memberdao memberdao = new Memberdao();
			ArrayList<Board> boardlist = memberdao.list();
			for(int i = 0 ; i < boardlist.size(); i++){%>
				<tr>
					<td><%= boardlist.get(i).getBno() %></td>
					<td><%= boardlist.get(i).getDate() %></td>
					<td><%= boardlist.get(i).getWriter() %></td>
					<td><a href="view.jsp?bno=<%=boardlist.get(i).getBno() %>"><%= boardlist.get(i).getTitle() %><a></td>
					<td><%= boardlist.get(i).getContent() %></td>
				</tr>
			<%}%>
	</table>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../header.jsp" %>
	<div class="container">
		<h3> 자유 게시판 </h3>
		<a href="boardwrite.jsp">글쓰기</a>
		<table>
			<tr>
				<th>번호</th> 제목 <th>내용</th>  <th>작성자</th>
 				<th>조회수</th> <th>작성일</th> <th> <input type="file" value="첨부파일"> </th>
			</tr>
			<!-- 반복문 -->
			<tr>
			
			</tr>
		</table>
	</div>
	<%@ include file="../footer.jsp" %>
</body>
</html>
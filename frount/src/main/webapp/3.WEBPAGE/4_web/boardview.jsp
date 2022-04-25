<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="container">
		<h3 class="text-center titleline">문의글</h3>
		<!-- 버튼 -->
		<div>
			<a href="boardlist.jsp" class="btn btn-outline-info">목록보기</a> <a
				href="boardlist.jsp" class="btn btn-outline-info">삭제</a> <a
				href="boardlist.jsp" class="btn btn-outline-info">수정</a> <a
				href="boardlist.jsp" class="btn btn-outline-info">답변</a>
		</div>
		<!-- 작성자 입력한 내용 -->
		<div>
			<div class="row">
				<div class="col-md-3">
					작성자: <input type="text" class="form-control" readonly="readonly">
				</div>
				<div class="col-md-3">
					비밀번호: <input type="password" class="form-control" readonly="readonly">
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					제목: <input type="text" placeholder="문의 제목을 작성해주세요" maxlength="50"
						class="form-control" readonly="readonly">
				</div>
			</div>
			내용:
			<textarea rows="20" cols="" class="form-control" placeholder="문의내용작성" readonly="readonly" style="resize: none;"></textarea>
		</div>
		<!-- 관리자가 답변한 내용 -->
		<div>
			<textarea rows="" cols="" class="form-control" readonly="readonly" style="resize: none;">ssd</textarea>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>
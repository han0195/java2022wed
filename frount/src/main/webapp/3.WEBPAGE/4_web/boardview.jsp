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
		<h3 class="text-center titleline">���Ǳ�</h3>
		<!-- ��ư -->
		<div>
			<a href="boardlist.jsp" class="btn btn-outline-info">��Ϻ���</a> <a
				href="boardlist.jsp" class="btn btn-outline-info">����</a> <a
				href="boardlist.jsp" class="btn btn-outline-info">����</a> <a
				href="boardlist.jsp" class="btn btn-outline-info">�亯</a>
		</div>
		<!-- �ۼ��� �Է��� ���� -->
		<div>
			<div class="row">
				<div class="col-md-3">
					�ۼ���: <input type="text" class="form-control" readonly="readonly">
				</div>
				<div class="col-md-3">
					��й�ȣ: <input type="password" class="form-control" readonly="readonly">
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					����: <input type="text" placeholder="���� ������ �ۼ����ּ���" maxlength="50"
						class="form-control" readonly="readonly">
				</div>
			</div>
			����:
			<textarea rows="20" cols="" class="form-control" placeholder="���ǳ����ۼ�" readonly="readonly" style="resize: none;"></textarea>
		</div>
		<!-- �����ڰ� �亯�� ���� -->
		<div>
			<textarea rows="" cols="" class="form-control" readonly="readonly" style="resize: none;">ssd</textarea>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> 제품 목록 페이지 </h3>
	<table>
		<tr>
			<th width="6%">제품번호</th>
			<th width="6%">대표이미지</th>
			<th width="6%">제품명</th>
			<th width="6%">가격</th>
			<th width="6%">할인율</th>
			<th width="6%">판매금액</th>
			<th width="6%">제품상태</th>
			<th width="6%">카테고리</th>
			<th width="6%">색상</th>
			<th width="6%">사이즈</th>
			<th width="6%">재고수량</th>
			<th width="6%">수정일</th>
			<th width="6%">비고</th>
		</tr>
		<%
		ArrayList<Product> products = ProductDao.getProductDao().getproductlist();	
		System.out.println(products);
		for(Product p : products){
		%>
			<tr>
				<th><%= p.getPno() %></th>
				<th> <img width="100%" alt="" src="../admin/productimg/<%= p.getPimg() %>"> </th>
				<th><%=p.getPname() %></th>
				<th><%=p.getPprice() %></th>
				<th><%=p.getPdiscount() %></th>
				<th><%=p.getPprice() * p.getPdiscount() %></th>
				<th><%=p.getPactive() %></th>
				<th><%=p.getCno() %></th>
				<th>색상</th>
				<th>사이즈</th>
				<th>재고수량</th>
				<th>수정일</th>
				<th>비고</th>
				<th>
					<button onclick="pnomove(<%= p.getPno() %>)" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#activemodal">상태변경</button>
					<button>제품삭제</button>
					<button>품절</button>
					<button>취소</button>
				</th>
			</tr>
			<
		<% } %>
	</table>
	<!-- 상대변경 모달 구역  -->
	<div class="modal" tabindex="-1" id="activemodal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">제품 상태변경</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<p>변경할 상태를 선택해주세요.</p>
					<input type="hidden" id="modelinput">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" onclick="activechange(0)">판매</button>
					<button type="button" class="btn btn-secondary" onclick="activechange(1)">준비</button>
					<button type="button" class="btn btn-secondary" onclick="activechange(2)">품절</button>
					<button type="button" class="btn btn-secondary" onclick="activechange(3)">중단</button>
					<button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="modalclosebtn">취소</button>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="/jspweb/js/productlist.js"></script>
</body>
</html>
<%@page import="java.awt.event.MouseEvent"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% // 자바 작성되는 공간
		// 폼이 전송하기전에는 요청을 할수가 없다. [null]
		Calendar calendar = Calendar.getInstance();
						
		int year = 2022;	int month = 4;
		boolean ch = false; // 출력가능 달력이면 flase
		if(request.getParameter("year") != null && request.getParameter("month") != null){
			year = Integer.parseInt( request.getParameter("year"));
			month = Integer.parseInt( request.getParameter("month"));	
			if(month == 0){
				month = 12;	year--;		
			}else if(month > 12){
				month = 1;	year++;	
			}
			
			if(year < 1900 && month < 0 || month > 12){
				ch = true; // 출력불가능 달력이면 true
			}
		}else {	}
		calendar.set(year, month-1, 1);
		int sweek = calendar.get(Calendar.DAY_OF_WEEK); // 해당 월의 시작 주 1~7
		int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);// 해당 월의 마지막 일 구하기
		
		String s = request.getParameter("down");
		
	%>
	<!-- html 작성 공간 -->
	<%if(ch == true){ %>
	<div>표현할수없는 달력입니다.</div>
	<%} %>
	
	<form action="달력.jsp" method="get">
		<input type="text" name="year" placeholder="연도"> 
		<input type="text" name ="month" placeholder="월">
		<input type="submit" value="검색">
	</form>
	
	
	<p> 입력한 연도: <%= year %></p>
	<p> 입력한 월: <%= month %></p>
	
	<form action="달력.jsp" method="get">
		<input type="text" name="year" value="<%=year%>" >
		<input type="text" name="month" value="<%=month	 - 1%>" >
		
		<input type="submit" value="이전">	
	</form>
	
	<form action="달력.jsp" method="get">
		<input type="text" name="year" value="<%=year%>" >
		<input type="text" name="month" value="<%=month + 1%>" >
		<input type="submit" value="다음">	
	</form>
	
	<table>
		<tr>
			<td> 일요일 </td>
			<td> 월요일 </td>
			<td> 화요일 </td>
			<td> 수요일 </td>
			<td> 목요일 </td>
			<td> 금요일 </td>
			<td> 토요일 </td>
		</tr>
		<tr>
			<% for(int i = 1; i < sweek ; i++){ %>
				<td> </td>
			<% } %>
			<!-- 1일부터 마지막일까지 1씩 증가 하면서 출력 -->
			<% for(int i = 1; i <= eday ; i++){ %>
				<td> <%= i %> </td>
				<!-- 7의 배수마다 줄바꿈 [ 토요일 마다 ] -->
				<% if( sweek % 7 == 0){ %>
					</tr> <tr>	
				<% } %>
				<% sweek++; %>
			<% } %>
		</tr>
	</table>
	<%= s %>
</body>
</html>
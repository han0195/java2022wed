<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- 
		전 페이지로부터 request(요청)
		request : 서블릿에서 제공해주는 내장객체(미리 만들어진 객체)
		request.getParameter("요철할 변수의 name값")
      -->
      
	<%
		// 스크립트문 = 자바 언어를 작성하고 실행하는 영역
		String 이름 = request.getParameter("name");
		String 색상 = request.getParameter("color");
		boolean admin = true;
		if( !이름.equals("관리자")){
			admin = false;
		}
		int 반복횟수 = Integer.parseInt(request.getParameter("num")); 
	%>
	
	<html>
		<body style="background-color:  <%= 색상%>">
			작성한 이름 : <%= 이름 %>
			작성한 색상 : <%= 색상 %>
			// 제어문
			<!-- 제어문 -->
			<%
				if(admin == true){	
			%>
				<div> 관리자 이군요. </div>
			<%
				}
			%>
			
			<!-- 반복문 -->
			<%
				for(int i = 0; i < 반복횟수; i++){
					for(int s = 0; s <=i ; s++){
			%>
					<span style="color: white;">*</span>
			<%
					}
					%>
					<br>
			<%
				}
			%>
			
			<% 
				for(int i = 0 ; i < 반복횟수 ; i++){
					for(int j = 0 ; j < 반복횟수-i; j++){
			%>
					<span>&nbsp;</span>
					<% 
					}
					%>
					
					<% 
					for(int z = 0 ; z < i * 2 + 1; z++){
					%>
					<span>*</span>
					<% 
					}
					%>
					<br>
			<% 
				}
			%>
			
			
			
			
		</body>
	</html>
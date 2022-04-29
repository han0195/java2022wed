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
	
	<%
		request.setCharacterEncoding("UTF-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		
		Memberdao memberdao = new Memberdao();
		
		boolean result = memberdao.loginpass(id, pw);
		if(result){
			response.sendRedirect("main.jsp");
			session.setAttribute("loginid", id);
			// 서블릿 내장객체 : session
				// 서버내[톰캣] 필드 생성 // 모든 페이지[파일]에서 접근할수있는 메모리
				// 브라우저마다 메모리 별도생성
		}else{
			response.sendRedirect("main.jsp");
		}
				
	%>
	
	
	
</body>
</html>
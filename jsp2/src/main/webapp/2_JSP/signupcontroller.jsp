<%@page import="dao.Memberdao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
		    
    <%
		//컨트롤러페이지
		
		// request : 요청 [ 서버가 --> 클라이언트 ]
				// 요청시 사용되는 한글인코딩
		request.setCharacterEncoding("UTF-8");
    	
		String id = request.getParameter("id");
    	String pw = request.getParameter("password");
    	String name = request.getParameter("name");
    	
		// dto -> 객체화
		Member member = new Member(0,id, pw, name);
		
		// 객체(dto) -> dao (DB)
		Memberdao memberdao = new Memberdao();
		boolean pass = memberdao.signup(member);
		if(pass){
			response.sendRedirect("main.jsp");
			// response.sendRedirect(""); 이동할 페이지
		}else {
			
		}
		
    %>
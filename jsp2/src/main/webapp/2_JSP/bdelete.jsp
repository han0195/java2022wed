<%@page import="dao.Memberdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	request.setCharacterEncoding("UTF-8");
	int bno = Integer.parseInt(request.getParameter("bno"));
	Memberdao memberdao = new Memberdao();
	boolean pass = memberdao.bdelete(bno);
	if(pass){
		response.sendRedirect("main.jsp");
	}

%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
	//session.invalidate();// 모든 세션 초기화
	session.setAttribute("loginid", null);
	response.sendRedirect("main.jsp");
%>
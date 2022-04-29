<%@page import="dao.Memberdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%
 	Memberdao memberdao = new Memberdao();
 	String id = (String) session.getAttribute("loginid");
 	boolean pass = memberdao.memberdelete(id);
 	if(pass){
 		session.setAttribute("loginid", null);
 		response.sendRedirect("main.jsp");
 	}else {
 		response.sendRedirect("main.jsp");
 	}
 %>
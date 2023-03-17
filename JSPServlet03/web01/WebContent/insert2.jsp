
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주세요.(request이용) -->
    <!-- 2. dao에게 값 전달.(DAO이용) 생략-->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요.  -->
 <%
 	String title = request.getParameter("title"); 
 	String content = request.getParameter("content"); 
 	String writer = request.getParameter("writer"); 
 	
 	BbsVO bag = new BbsVO();
 	bag.setTitle(title);
 	bag.setContent(content);
 	bag.setWriter(writer);
 
 	BbsDAO dao = new BbsDAO();
	dao.insert(bag);
	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
작성한 title : <%= title %> <br>
작성한 content : <%= content %> <br>
작성한 writer : <%= writer %> <br>
</body>
</html>
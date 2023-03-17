<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO33"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%

    	String id = request.getParameter("id");

    	MemberDAO33 dao = new MemberDAO33();
    	MemberVO bag = dao.one(id);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ID :  <%= id %>
<hr color="red">
검색한 제목 : <%= bag.getName() %> <br>
검색한 내용 : <%= bag.getPw() %> <br>
검색한 글쓴이 : <%= bag.getTel() %> <br>
</body>
</html>
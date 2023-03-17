<%@ page import="multi.WebtoonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<jsp:useBean id="bag" class="multi.WebtoonVO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
	
 <%
 	WebtoonDAO dao = new WebtoonDAO();
 	dao.insert(bag);
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
랭킹 등록 완료<br>
</body>
</html>
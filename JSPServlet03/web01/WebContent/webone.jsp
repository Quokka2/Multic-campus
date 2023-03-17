<%@page import="multi.WebtoonVO"%>
<%@page import="multi.WebtoonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	WebtoonDAO dao = new WebtoonDAO();
	WebtoonVO bag2 = dao.one(id);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	당신이 검색을 원하는 id는
	<%=id%>
	<hr color="red">
	<table class="table table-hover table-dark">
		<tr>
			<td>웹툰 순위</td>
			<td><%=bag2.getId()%></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><%=bag2.getTitle()%></td>
		</tr>
		<tr>
			<td>작가</td>
			<td><%=bag2.getCartoonist()%></td>
		</tr>
		<tr>
			<td>별점</td>
			<td><%=bag2.getStar()%></td>
		</tr>
		<tr>
			<td>상품이미지</td>
			<td><img src="img/<%=bag2.getImg()%>" width=100 height=100></td>
		</tr>
	</table>
</body>
</html>
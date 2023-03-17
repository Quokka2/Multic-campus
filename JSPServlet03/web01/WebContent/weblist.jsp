<%@page import="multi.WebtoonVO"%>
<%@page import="multi.WebtoonDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	WebtoonDAO dao = new WebtoonDAO();
ArrayList<WebtoonVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
a {
	text-decoration: none;
	color: white;
}

.table {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<table class="table table-hover table-dark">
		<tr>
			<td>순위</td>
			<td>작품</td>
			<td>작가</td>
			<td>별점</td>
			<td>표지</td>
		</tr>
		<%
			for (WebtoonVO bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getId()%></td>
			<td><a href="webone.jsp?id=<%=bag2.getId()%>"> <%=bag2.getTitle()%></a></td>
			<td><%=bag2.getCartoonist()%></td>
			<td><%=bag2.getStar()%></td>
			<td><a href="img/<%=bag2.getImg()%>"> <img src="img/<%=bag2.getImg()%>" width=50 height=50></a></td>
			<!-- 이미지 클릭하면 이미지 원본 나오게 작동 -->
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
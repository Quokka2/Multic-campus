<%@page import="multi.MovieVO2"%>
<%@page import="multi.MovieDAO2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	MovieDAO2 dao = new MovieDAO2();
ArrayList<MovieVO2> list = dao.list();
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
	전체 영화 :
	<%=list.size()%>
	<%
		if (list.size() == 0) {
	%>
	<h3>영화 없으니까 넷플릭스 봐라~~~</h3>
	<%
		} else {
	%>
	<table class="table table-danger table-striped">
		<tr>
			<td>id</td>
			<td>title</td>
			<td>content</td>
			<td>location</td>
			<td>director</td>
		</tr>
		<%
			for (MovieVO2 bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getId()%></td>
			<td><a href="one4.jsp?id=<%=bag2.getId()%>"> <%=bag2.getTitle()%></a></td>
			<td><%=bag2.getContent()%></td>
			<td><%=bag2.getLocation()%></td>
			<td><%=bag2.getDirector()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		}
	%>
</body>
</html>
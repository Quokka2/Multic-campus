<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
td{
	width: 100px;
	text-align: center;
}
.top{
	background: black;
	color: white;
}
.down{
	background: lime;
}
</style>
</head>
<body>
<table>
<tr>
	<td class="top">id</td>
	<td class="top">pw</td>
	<td class="top">name</td>
	<td class="top">tel</td>
	<td class="top">tel</td>
	<td class="top">tel</td>
</tr>
<c:forEach items="${list}" var="bag">
<tr>
	<td class="down">${bag.userid}</td>
	<td class="down">${bag.gender}</td>
	<td class="down">${bag.local}</td>
	<td class="down">${bag.name}</td>
	<td class="down">${bag.store}</td>
	<td class="down">${bag.count}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
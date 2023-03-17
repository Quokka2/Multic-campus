<%@ page import="multi.WebtoonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.WebtoonVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />
<%
	WebtoonDAO dao = new WebtoonDAO();
	dao.update(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
	랭킹 수정 요청되었음.
	<hr color="red">
	작성한 id : <%= bag.getId()%><br>
	작성한 title : <%= bag.getTitle()%><br>
</body>
</html>
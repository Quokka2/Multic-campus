<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함.==> 자바로 짜야함. -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
    <%
    	//스크립트릿 - 조금 코드를 써서 만드는 작은 프로그램 
        //자바코드 넣는 부분!!
       	//HttpServletRequest request = new HttpServletRequest();
        //tomcat은 미리 reqeust를 만들어서 내장시켜놨어요! 
        String no = request.getParameter("no");
        String content = request.getParameter("content");
        
		BbsVO bag = new BbsVO();
		bag.setNo(Integer.parseInt(no));
		bag.setContent(content);
		
		BbsDAO dao = new BbsDAO();
		dao.update(bag);
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음. -->
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
게시글 수정  요청되었음.
<hr color="red">
작성한 no : <%= no %> <br>
작성한 content : <%= content %> <br>
</body>
</html>
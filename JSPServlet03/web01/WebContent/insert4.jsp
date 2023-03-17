<%@ page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
	
 <%
 	/* String id = request.getParameter("id");
 	String name = request.getParameter("name");
 	String content = request.getParameter("content");
 	String price = request.getParameter("price");
 	String company = request.getParameter("company");
 	String img = request.getParameter("img"); */

    /* 	ProductVO bag = new ProductVO();
 	bag.setId(id);
 	bag.setName(name);
 	bag.setContent(content);
 	bag.setPrice(Integer.parseInt(price));
 	bag.setCompany(company);
 	bag.setImg(img); */
 	
 	MovieDAO dao = new MovieDAO();
 	dao.insert(bag);
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
제품이 등록했습돠 <br>
</body>
</html>
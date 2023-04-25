<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<h2>여성 선호 맛집</h2>
	<table>
		<tr>
		<c:forEach items="${list}" var="bag">
			<td>
				<div class="container mt-3">
					<div class="card img-fluid" style="width: 300px">
						<img class="card-img-top" src="resources/img/${bag.img}"
							alt="Card image" style="width: 100%">
						<div class="card-img-overlay">
							<h4 class="card-title" style="color:white;">${bag.storeAddress}</h4>
							<p class="card-text" style="color:white;">존맛탱</p>
							<a href="#" class="btn btn-primary" style="width:50px">${bag.num}</a>
						</div>
					</div>
				</div>
			</td>
		</c:forEach>
		</tr>
	</table>
</body>
</html>
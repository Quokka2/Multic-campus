<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
<script type="text/javascript">
$(function() {
	$.ajax({
		url: "list.memo",
		success: function(table) {
			$('#result').html(table)
		}
	})
})
</script>
<style type="text/css">
	h3{
		width: 800px;
		height: 35px;
		background: pink;
	}
</style>
</head>
<body>
<h3>멀티 메모장</h3>
<hr color="blue">
	<form action="insert.memo">
		이름 : <input name="name" value="win">
		메모 : <input name="content"  size="30" value="win">
		날씨 : <input name="weather" value="win"><br>
		<button>등록</button>
	</form>
<hr color="blue">	
<div id="result" style="background=pink" ></div>
</body>
</html>
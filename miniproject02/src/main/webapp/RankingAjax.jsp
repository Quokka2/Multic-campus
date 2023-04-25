<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list",
				success : function(x) {
					$('#result').append(x)
				}
			})//ajax
		})//b1
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					storeAddress : "브릭루즈"
				},
				success : function(x) {
					$('#result').append(x)
				}
			})//ajax
		})//b2
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list1",
				success : function(x) {
					$('#result').append(x)
				}
			})//ajax
		})//b2
	})//$
</script>
</head>
<body>
	<button id="b1">맛집리스트 가지고 오기</button>
	<button id="b2">맛집리스트2 가지고 오기</button>
	<button id="b3">맛집리스트(성별) 가지고 오기</button>
	<hr color="red">
	<div id="result"></div>
</body>
</html>
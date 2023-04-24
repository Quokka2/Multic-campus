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
					store : "우리할매떡볶이"
				},
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
	<hr color="red">
	<div id="result" style="background: yellow"></div>
</body>
</html>
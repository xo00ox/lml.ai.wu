<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script type="text/javascript"
	src="<c:url value='/js/jquery-1.11.3.min.js'/>"></script>
</head>
<body>
	<div style="margin-top: 5%; margin-left: 5%; float: left;">
		<ul>
			<li class="active"><a href="<c:url value='/home/index'/>"
				target="test">Home </a></li>
			<li><a href="<c:url value='/getUserList'/>" target="test">用户列表
			</a></li>
			<li><a href="#">Gallery </a></li>
			<li><a href="#">Services </a></li>
			<li><a href="#">系统管理 </a></li>
			<li><a href="#">Portfolio </a></li>
			<li><a href="#">About </a></li>
			<li><a href="#">Contact </a></li>
		</ul>
	</div>
	<div id="content"
		style="margin-right: 5%; margin-top: 5%; display: inline; float: right; height: 400px; width: 1000px">
		<iframe height="400px" width="1000px" src="" name="test"></iframe>
	</div>
	<input type="button" id="list" value="测试数组提交">
</body>
<script type="text/javascript">
	$(function() {
		var list = [];
		var list2 = [];
		var result=false;
		for (var i = 0; i < 5; i++) {
			list[i] = "你好" + i;
			list2[i] = "你也好" + i;
		}
		$("#list").click(function() {
			$.ajax({
				type : "post",
				url : "<c:url value='/test'/>",
				data : {
					"list" : list,
					"list2" : list2,"b":result
				},
				success : function(data) {
					console.log(data)
				}
			})
		})
	})
</script>
</html>
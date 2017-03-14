<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="<c:url value='/js/jquery-1.11.3.min.js'/>"></script>
<title>Insert title here</title>
</head>
<body>
	<h2 style="text-align: center;">HelloWord!</h2>

	<select id="no1" onchange="select()">
		<option>请选择</option>
		<option>福建省</option>
		<option>浙江省</option>
	</select>
	<select id=no2>
		<option>请选择</option>
	</select>
</body>

<script type="text/javascript">
	function select() {
		$.ajax({
			type : "post",
			url : "<c:url value='/home/test'/>",
			success : function(data) {
				console.log(data)
				if (data != null && data.length > 0) {
					for (var i = 0; i < data.length; i++) {
						console.log(data[i])
						$("#no2").append("<option>"+data[i]+"</option>")
					}
				} 
			}
		})
	}
</script>



</html>
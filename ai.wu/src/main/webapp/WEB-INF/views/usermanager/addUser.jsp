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
<script type="text/javascript"
	src="<c:url value='/js/My97DatePicker/WdatePicker.js'/>"></script>
<title>Insert title here</title>
</head>
<body>
<h2>新增用户</h2>
	<form id="userform" method="post">
		用户名：<input type="text" name="userName"><br> 生日：<input
			type="text" name="birthday" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
		<br> 性别：<select name="sex">
			<option value="男">男</option>
			<option value="女">女</option>
		</select> <br> 年龄：<input type="text" name="age"><br> 地址：<input
			type="text" name="address"><br> 密码：<input
			type="password" name="userPassword"><br> <input
			type="button" id="sub" value="提交" />
	</form>
</body>
<script type="text/javascript">
	$("#sub").click(function() {
		$.ajax({
			type : "post",
			url : "<c:url value='/addUser'/>",
			data : $("#userform").serialize(),
			success : function(data) {
				if (true == data) {
					alert("保存成功！");
					/* windon.location.reload(); */
					location.href = "<c:url value='/getUserList'/>";
				} else {
					alert("保存失败！");
				}			
			}
		})
	});
</script>
</html>
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
	<h2>编辑用户</h2>
	<form id="subuser" method="post">
		<input type="hidden" name="userId" value="${user.userId}" /> <br>
		用户名：<input type="text" name="userName" value="${user.userName}"><br>
		生日：
		<%-- <input type="text" name="birthday" value="${user.birthday}"> --%>
		<input type="text" name="birthday" value="${user.birthday}"  onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})">
		<br> 性别：
		<%-- 	<input type="text" name="sex" value="${user.sex}"> --%>
		<select name="sex">
			<option value="男"
				<c:if test='${user.sex eq "男"}'> selected='selected' </c:if>>男</option>
			<option value="女"
				<c:if test='${user.sex eq "女"}'> selected='selected'</c:if>>女</option>

		</select> <br> 年龄：<input type="text" name="age" value="${user.age}"><br>
		地址：<input type="text" name="address" value="${user.address}"><br>
		密码：<input type="password" name="userPassword"
			value="${user.userPassword}"><br> <input type="button"
			id="updateuser" value="保存">
	</form>
</body>
<script type="text/javascript">
	$("#updateuser").click(function() {
		$.ajax({
			url : "<c:url value='/updateUser'/>",
			type : "post",
			data : $("#subuser").serialize(),
			success : function(data) {
				if (true == data) {
					alert("保存成功")
					location.href = "<c:url value='/getUserList'/>";
				} else {
					alert("修改失败")
				}
			}
		})
	})
</script>
</html>
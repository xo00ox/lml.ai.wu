<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<c:url value='/js/jquery-1.11.3.min.js'/>"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value='/user'/>" method="post">
	<input type="hidden" id="p" name="currentPage" value="${currentPage }">
		<div>
			<input type="text" /> <input type="button" value="搜索">
		</div>
		<div>
			<table>
				<thead>
					<tr>
						<th>序号</th>
						<th>用户名</th>
						<th>性别</th>
						<th>年龄</th>
						<th>地址</th>
						<th>生日</th>
						<th>密码</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pageinfo.list}" var="item" varStatus="num">
						<tr>
							<td>${num.index+1}</td>
							<td>${item.userName }</td>
							<td>${item.sex }</td>
							<td>${item.age }</td>
							<td>${item.address }</td>
							<td>${item.birthday}</td>
							<td>${item.userPassword}</td>
							<td><a href="#">编辑</a>|<a href="javascript:;">删除</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<input type="button" value="上一页" onclick="gotos('${pageinfo.prePage}')"/>
			<input type="button" value="下一页" onclick="gotox('${pageinfo.nextPage}')"/>
		</div>
	</form>
</body>
<script type="text/javascript">
function gotos(i)
{
	$("#p").val(i);
	document.forms[0].submit()
}
	function gotox(i)
	{
		$("#p").val(i);
		document.forms[0].submit()
	}
</script>
</html>
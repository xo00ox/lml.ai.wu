<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
	<form action="<c:url value='/user'/>" method="post">
		<input type="hidden" id="p" name="currentPage" value="${currentPage }">
		<div>
			请输入用户名：<input type="text" name="search" value="${search}"/> 
			<input type="button" value="搜索" onclick="$('#currentPage').val(1);document.forms[0].submit();"/>
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
		当前共${ pageinfo.pages}页，${ pageinfo.total}条数据
			<input type="button" value="首页"
				onclick="gotofirst('${pageinfo.firstPage}')"/> <input
				type="button" value="上一页" onclick="gotopre('${pageinfo.prePage}')" <c:if test="${! pageinfo.hasPreviousPage}"> disabled="disabled"</c:if> />
			 <c:forEach begin="0" end="${fn:length(pageinfo.navigatepageNums)}" varStatus="status">
							<a href="" onclick="go('${ pageinfo.navigatepageNums[status.index]}');return false;"> ${ pageinfo.navigatepageNums[status.index]}</a>		
							</c:forEach> 
			<input type="button" value="下一页"
				onclick="gotonext('${pageinfo.nextPage}')" <c:if test="${! pageinfo.hasNextPage}"> disabled="disabled"</c:if>/>
				<input type="button" value="尾页"
				onclick="gotolast('${pageinfo.lastPage}')"/>
																				
																		
							
		</div>
	</form>
</body>
<script type="text/javascript">
	function go(i)
	{
		$("#p").val(i);
		document.forms[0].submit()
	}
	function gotopre(i) {
		$("#p").val(i);
		document.forms[0].submit()
	}
	function gotonext(i) {
		$("#p").val(i);
		document.forms[0].submit()
	}
	function gotofirst(i) {
		$("#p").val(i);
		document.forms[0].submit()
	}
	function gotolast(i) {
		$("#p").val(i);
		document.forms[0].submit()
	}
	
</script>
</html>
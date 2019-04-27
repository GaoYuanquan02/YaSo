<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function sel(id){
		location="sel.jsp?id="+id;
	}
</script>
<style type="text/css">
	.col-md-2{
		height:40px;
	}
	
</style>
<title>Insert title here</title>
</head>
<body>
	<form action="list.do" method="post">
		<input type="text" value="${name }" name="name">
		<input type="submit" value="搜索">
	</form>
	<table class="class table-bordered table-striped">
		<tr align="center">
			<td>项目序号</td>
			<td>项目名称</td>
			<td>投资金额</td>
			<td>分管领导</td>
			<td>所在部门</td>
			<td>详细操作</td>
		</tr>
		<c:forEach items="${list }" var="list">
			<tr align="center">
				<td class="col-md-2">${list.id }</td>
				<td class="col-md-2">${list.name }</td>
				<td class="col-md-2">${list.price }</td>
				<td class="col-md-2">${list.gname }</td>
				<td class="col-md-2">${list.dname }</td>
				<td><input type="button" value="查询详情" onclick="sel(${list.id})"></td>
			</tr>
		</c:forEach>
		<tr align="center">
			<td colspan="100">${fenye  }</td>
		</tr>
	</table>
</body>
</html>
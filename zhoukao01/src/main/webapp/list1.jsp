<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/index1.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="list" method="post">
		<input type="text" name="name" value="${name }">
		
		
		<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${list }" var="list">
			<tr>
				<td>${list.cid }</td>
				<td>${list.name }</td>
				<td>${list.age }</td>
				<td>${list.sex }</td>
			
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">${fenye }</td>
		</tr>
	</table>
</body>
</html>
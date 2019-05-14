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
	function add(){
		location="add.jsp";
	}
	function upd(id){
		location="update.jsp?id="+id;
	}
	function sel(id){
		location="sel.jsp?id="+id;
	}
	function checkAll(){
		$("[name=gid]").prop("checked",!$("[name=gid]").prop("checked"));
	}
	function checkFan(){
		$("[name=gid]").each(function(){
			$(this).prop("checked",!$(this).prop("checked"));
		});
		
	}
	function delAll(){
		var ids = $("[name='gid']:checked").map(function(){
			return $(this).val();
		}).get().join()
		if(ids==''){
			alert("请选择");
		}else{
			if(confirm("确认要删除吗？")){

				if(ids.length==1){
					alert("批量删除不能删除一个");
				}else{
					$.post("delAll.do",{ids:ids},function(msg){
						if(msg){
							alert("删除成功")
							location="list.do"
						}else{
							alert("删除失败")
						}
					},"json");
				}
			}
		}
	
		
			
			
		
		
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="list.do" method="post">
		<input type="text" name="gname" value="${gname }">
		<input type="submit" value="搜索" > 
	</form>
	<table>
		<input type="button" value="全选/全不选" onclick="checkAll()">
		<input type="button" value="反选" onclick="checkFan()">
		<input type="button" value="批量删除" onclick="delAll()">
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>商品尺寸</td>
			<td>商品价格</td>
			<td>商品数量</td>
			<td>商品标签</td>
			<td><input type="button" value="添加" onclick="add()"></td>
		</tr>
		<c:forEach items="${list }" var="list">
			<tr>
				<td><input type="checkbox" name="gid" value="${list.gid }">${list.gid }</td>
				<td>${list.gname }</td>
				<td>${list.bname }</td>
				<td>${list.kname }</td>
				<td>${list.size }</td>
				<td>${list.price }</td>
				<td>${list.count }</td>
				<td>${list.biao }</td>
				<td>
					<input type="button" value="编辑" onclick="upd(${list.gid })">
					<input type="button" value="详情" onclick="sel(${list.gid })">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">${fenye }</td>
		</tr>
	</table>
</body>
</html>
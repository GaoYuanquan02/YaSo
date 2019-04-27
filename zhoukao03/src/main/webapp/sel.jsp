<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
<script type="text/javascript">
	var id = ${param.id}
	$.post("selById.do",{id:id},function(arr){
		for (var i in arr) {
			$("[name='name']").val(arr[i].name);
			$("[name='miao']").val(arr[i].miao);
			$("[name='price']").val(arr[i].price);
			$("[name='gname']").val(arr[i].gname);
			$("[name='dname']").val(arr[i].dname);
			
		}
	},"json");
	function back(){
		location="list.do";
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<center>
		项目名称:<input type="text" name="name"><br><br>
		投资描述:<input type="text" name="miao"><br><br>
		投资金额:<input type="text" name="price"><br><br>
		分管领导:<input type="text" name="gname"><br><br>
		所在部门:<input type="text" name="dname"><br><br>
		<input type="button" value="返回" onclick="back()">
	</center>
</body>
</html>
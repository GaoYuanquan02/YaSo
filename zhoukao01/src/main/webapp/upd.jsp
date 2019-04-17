<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/index1.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	var id = ${param.id}
	$.post("selById",{id:id},function(obj){
		$("[name='name']").val(obj.name);
		$("[name='age']").val(obj.age);
		$("[name='desce']").val(obj.desce);
		$("[name='sex'][value='"+obj.sex+"']").prop("checked",true);
	},"json");
	function add(){
		$.post("updCriminal",$("form").serialize(),function(msg){
			if(msg){
				alert("修改成功");
				location="list"
			}else{
				alert("修改失败");
			}
		},"json");
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<center>
			<input type="hidden" name="cid" value="${param.id }"><br><br>
			姓名:<input type="text" name="name"><br><br>
			年龄:<input type="text" name="age"><br><br>
			性别:<input type="radio" name="sex" value="男">男
				<input type="radio" name="sex" value="女">女<br><br>
			详细描述:<input type="text" name="desce"><br><br>
			<input type="button" value="修改" onclick="add()">
		</center>
	</form>
</body>
</html>
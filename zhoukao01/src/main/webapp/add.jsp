<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/index1.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function add(){
		$.post("addCriminal",$("form").serialize(),function(msg){
			if(msg){
				alert("添加成功");
				location="list"
			}else{
				alert("添加失败");
			}
		},"json");
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<center>
			姓名:<input type="text" name="name"><br><br>
			年龄:<input type="text" name="age"><br><br>
			性别:<input type="radio" name="sex" value="男">男
				<input type="radio" name="sex" value="女">女<br><br>
			详细描述:<input type="text" name="desce"><br><br>
			<input type="button" value="添加" onclick="add()">
		</center>
	</form>
</body>
</html>
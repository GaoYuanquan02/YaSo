<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/index1.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$.post("getBrand.do",function(arr){
			for (var i in arr) {
				$("[name='bid']").append("<option value="+arr[i].bid+">"+arr[i].bname+"</option>");
			}
		},"json");
		$.post("getKind.do",function(arr){
			for (var i in arr) {
				$("[name='kid']").append("<option value="+arr[i].kid+">"+arr[i].kname+"</option>");
			}
		},"json");
	})
	function add(){
		$.post("add.do",$("form").serialize(),function(msg){
			if(msg){
				alert("添加成功")
				location="list.do";
			}else{
				alert("添加失败")
			}
		},"json");
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form>
		<center>
			商品名称:<input type="text" name="gname"><br><br>
			商品品牌:<select name="bid">
					<option>--请选择商品品牌--</option>
			      </select><br><br>
			商品种类:<select name="kid">
					<option>--请选择商品种类--</option>
			      </select><br><br>
			商品尺寸:<input type="text" name="size"><br><br>
			商品价格:<input type="text" name="price"><br><br>
			商品数量:<input type="text" name="count"><br><br>
			商品标签:<input type="text" name="biao"><br><br>
			选择图片:<input type="file" name="picture"><br><br>
			<input type="button" value="添加" onclick="add()">
		</center>
	</form>
</body>
</html>
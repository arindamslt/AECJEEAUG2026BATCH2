<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="NavClient.jsp"></jsp:include>
<!DOCTYPE html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDERED FOOD</title>
</head>
<body>
<div style="width: 30%;margin:50px auto;">
	<h2 class="text-warning">ORDER FOOD</h2>
	<form action="" method="post">
	<input type="text" name="fid" class="form-control" placeholder="ENTER THE FOOD ID"/>
	<input type="text" name="qty" class="form-control" placeholder="ENTER THE QUANTITY"/>
	<input type="text" name="uname" class="form-control" placeholder="ENTER THE USERNAME"/>
	<input type="submit" class="btn btn-outline-warning" value="ORDER"/>
	</form>
</div>
</body>
</html>
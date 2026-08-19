<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDER PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width: 30%;margin:50px auto;">
	<h2 class="text-warning">PURCHASE FORM</h2>
	<form action="Show.jsp" method="post">
	<input type="text" name="oid" class="form-control" placeholder="ENTER THE ORDER ID"/>
	<input type="text" name="pid" class="form-control" placeholder="ENTER THE PRODUCT ID"/>
	<input type="text" name="pname" class="form-control" placeholder="ENTER THE PRODUCT NAME"/>
	<input type="text" name="pqty" class="form-control" placeholder="ENTER THE PRODUCT QUANTITY"/>
	<input type="text" name="price" class="form-control" placeholder="ENTER THE PRODUCT PRICE"/>
		<input type="submit" class="btn btn-outline-warning" value="PURCHASE"/>
	</form>
</div>
</body>
</html>
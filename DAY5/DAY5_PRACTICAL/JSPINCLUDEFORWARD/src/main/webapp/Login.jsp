<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div style="width: 30%;margin:50px auto;">
	<h2 class="text-primary">LOGIN FORM</h2>
	<form action="Controller.jsp" method="post">
	<input type="text" name="uname" class="form-control" placeholder="ENTER THE USERNAME"/>
	<input type="password" name="pass" class="form-control" placeholder="ENTER THE PASSWORD"/>
	<input type="submit" class="btn btn-outline-primary" value="LOGIN"/>
	</form>
</div>
</body>
</html>
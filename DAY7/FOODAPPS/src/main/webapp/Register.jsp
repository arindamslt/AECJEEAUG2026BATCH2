<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION </title>
</head>
<body>
<div style="width: 30%;margin:50px auto;">
	<h2 class="text-secondary">REGISTRATION FORM</h2>
	<form action="RegisterAddServe" method="post">
	<input type="text" name="uname" class="form-control" placeholder="ENTER THE USERNAME"/>
	<input type="password" name="pass" class="form-control" placeholder="ENTER THE PASSWORD"/>
		<input type="text" name="nm" class="form-control" placeholder="ENTER YOUR NAME"/>
		<input type="submit" class="btn btn-outline-secondary" value="REGISTER"/>
	</form>
</div>
</body>
</html>
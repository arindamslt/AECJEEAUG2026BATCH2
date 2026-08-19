<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>
<div>
<h2 class="text-success">PURCHASE DETAILS INFORMATION</h2>
<%
String oid=request.getParameter("oid");
String pid=request.getParameter("pid");
String pname=request.getParameter("pname");
double pqty=Double.parseDouble(request.getParameter("pqty"));
double price=Double.parseDouble(request.getParameter("price"));

%>

<h3 class="text-primary">ORDER ID:<%=oid %>></h3>
<h3 class="text-secondary">PRODUCT ID:<%=pid %></h3>
<h3 class="text-success">PRODUCT NAME:<%=pname %></h3>
<h3 class="text-warning">QUANTITY:<%=pqty %></h3>
<h3 class="text-dark">PRODUCT PRICE:<%=price %></h3>
<h3 class="text-danger">TOTAL COST:<%=price*pqty %></h3>
</div>
</body>
</html>
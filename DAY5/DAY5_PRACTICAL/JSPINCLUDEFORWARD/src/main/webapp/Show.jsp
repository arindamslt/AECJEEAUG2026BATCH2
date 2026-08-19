<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Img1.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW PAGE</title>
</head>
<body>
<h2>USER DETAILS INFORMATION</h2>
<%
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");

%>
<h3>YOUR USERNAME:<%=uname %></h3>
<h3>YOUR PASSWORD:<%=pass %></h3>
</body>
</html>
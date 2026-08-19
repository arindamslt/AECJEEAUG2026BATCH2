<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TEST JSP PAGE</title>
</head>
<body>
<h2>JSP CONCEPTS</h2>
<%!
public int add(int a,int b)
{
	 return(a+b);
}

%>
<%
int x=10;
int y=25;
%>
<h2>RESULT:<%=x+y %></h2>
<br/>
<% out.println(x+y); %>

<%=add(5,6) %>
</body>
</html>
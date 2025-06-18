
demo_get2.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XML HTTP Get Method</title>
</head> <body>
<%
String firstName=request.getParameter("fname"); String lastName=request.getParameter("Iname"); out.println("Welcome "+firstName+" "+lastName); out.println("Thankyou for visiting My Web Page");
%>
</body> </html>
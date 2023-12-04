<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>		<!-- set isErrorPage to true -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	<%
	System.out.println("error.jsp page called");
	%>
	Error Occurred - 
	<%= 
	/*
	exception is an implicit object provided by jsp which can be used only on an error page
	exception refer to the object of the exception class that occurred in the main page
	*/ 
	exception.getMessage() 
	%>
</body>
</html>
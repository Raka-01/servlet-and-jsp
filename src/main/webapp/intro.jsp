<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<%
	
	int a = Integer.parseInt(request.getParameter("num1"));		// request is an implicit object
	int b = Integer.parseInt(request.getParameter("num2"));
	
	int result = a + b;
	
	out.println("Output - " + result);			// out is JSPWriter, an implicit object
	
	%>

</body>
</html>
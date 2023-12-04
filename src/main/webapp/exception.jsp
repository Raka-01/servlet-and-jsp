<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		System.out.println("exception.jsp file called");
		/*
		we can simpley handle the exception here using try-catch block
		instead of mentioning the errorPage
		but it is not recommended to handle the exception here
		*/
		int a = 10/0;
	%>
</body>
</html>
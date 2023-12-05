<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getAttribute("label").toString();
		out.println(name);
	%>
	
	<br>
	Using expression language - ${label}		<!-- expression language -->
	
	<br>
	<!-- Using JSTL tag -->
	Using JSTL tag - 
	<c:out value="Hello World"></c:out>
	<br>
	<c:out value="${label}"></c:out>
</body>
</html>
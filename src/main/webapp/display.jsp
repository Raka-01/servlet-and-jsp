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
	<!-- 
	<%
		String name = request.getAttribute("label").toString();
		out.println(name);
	%>
	
	<br>
	Using expression language - ${label}
	
	<br>
	Using JSTL tag - 
	<c:out value="Hello World"></c:out>
	<br>
	<c:out value="${label}"></c:out>
	-->
	
	<c:out value="Student hashcode - ${student}"></c:out><br>
	<c:out value="Student Name - ${student.name}"></c:out><br>
	<c:out value="Student Roll No - ${student.rollNo}"></c:out>
	
	<br><br>
	<c:out value="Student List : "></c:out><br>
	<c:forEach items="${students}" var="student">
		${student} <br>
	</c:forEach>
	
	<br><br>
	<c:out value="Student 1 : "></c:out><br>
	<c:out value="Name - ${students[0].name}"></c:out><br>
	<c:out value="Roll No - ${students[0].rollNo}"></c:out>
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/jsp" user="root" password="Raka@Database09"/>
	
	<sql:query var="rs" dataSource="${db}">select * from student</sql:query>
	
	<c:forEach items="${rs.rows}" var="students">
		<c:out value="${students.name}"></c:out> : <c:out value="${students.id}"></c:out> : <c:out value="${students.word}"></c:out> <br>
	</c:forEach>
	
</body>
</html>
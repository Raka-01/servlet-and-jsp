<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="str" value="Welcome to JSTL functions learning"></c:set>
	String : 
	<c:out value="${str}"></c:out><br><br>
	
	Splitting each word of string - <br>
	<c:forEach items="${fn:split(str, ' ')}" var="word">
		${word}
		<br>
	</c:forEach>
	
	<br>
	Index of JSTL = ${fn:indexOf(str, 'JSTL')}
	
	<br><br>
	String contains learn = ${fn:contains(str, 'learn')}
	
	<br><br>
	<c:if test="${fn:contains(str, 'JSTL')}">
		JSTL is present in the string
	</c:if>
	
</body>
</html>
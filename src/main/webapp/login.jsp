<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		This is the Login Page
		It does not require access credentials
		<%
			System.out.println("login.jsp called");
		%>
		<br>
		<form action="Login" method="post">
			Enter username : <input type="text" name="uname"><br>
			Enter password : <input type="password" name="pass"><br>
			<input type="submit" name="login">
		</form>
		
		<br><br>
		<a href="welcome.jsp">Welcome Page</a><br>
		<a href="videos.jsp">Videos Page</a><br>
		<a href="aboutus.jsp">About Us Page</a><br>
		
</body>
</html>
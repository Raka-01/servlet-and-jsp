<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<%	
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");		// HTTP 1.1
			response.setHeader("Pragma", "no-cache");		// HTTP 1.0
			response.setHeader("Expires", "0");				// Proxies
	
			
			System.out.println("welcome.jsp called");
			
			if(session.getAttribute("uname") == null || session.getAttribute("pass") == null){
				response.sendRedirect("login.jsp");
			}
			else if(session.getAttribute("validUser").equals(false)){
				response.sendRedirect("login.jsp");
			}
		%>
		
		This is the Welcome Page<br>
		It requires credentials to access the page<br>
		<h3>Welcome ${uname}</h3>
		
		<br><br>
		<a href="login.jsp">Login Page</a><br>
		<a href="videos.jsp">Videos Page</a><br>
		<a href="aboutus.jsp">About Us Page</a><br>
		
		<br><br>
		<form action="Logout">
			<input type="submit" name="logout" value="Logout">
		</form>
</body>
</html>
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
		
			System.out.println("videos.jsp called");
			
			if(session.getAttribute("uname") == null || session.getAttribute("pass") == null){
				response.sendRedirect("login.jsp");
			}
			else if(session.getAttribute("validUser").equals(false)){
				response.sendRedirect("login.jsp");
			}
		%>
		
		This is the videos page
		It requires credentials to access the page
		
		<br>
		<iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk?si=GDz6wr7tk0kvhWcR" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
		<br>
		
		<br><br>
		<a href="login.jsp">Login Page</a><br>
		<a href="welcome.jsp">Welcome Page</a><br>
		<a href="aboutus.jsp">About Us Page</a><br>
		
		<br><br>
		<form action="Logout">
			<input type=submit  name="logout" value="Logout">
		</form>
</body>
</html>
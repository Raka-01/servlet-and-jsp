package com.raka.servlet;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqAddCookie extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("SqAddCookie servlet called");
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		Cookie cookie = new Cookie("sum", sum + "");
		res.addCookie(cookie);
		
		res.sendRedirect("cookie-square");
	}

}

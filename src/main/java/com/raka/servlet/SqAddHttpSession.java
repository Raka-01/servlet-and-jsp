package com.raka.servlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqAddHttpSession extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sum = a + b;
		
		System.out.println("SqAddHttpSession servlet called");
		
		HttpSession session = req.getSession();
		session.setAttribute("sum", sum);
		
		res.sendRedirect("session-square");
	}

}

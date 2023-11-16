package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqAddSendRedirect extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sumResult = a + b;
		
		PrintWriter writer = res.getWriter();
		System.out.println("SqAddSendRedirect servlet called");
		writer.println("Add of numbers = " + sumResult);
		
		res.sendRedirect("send-square?sumResult=" + sumResult);		// URL Rewriting
	}

}

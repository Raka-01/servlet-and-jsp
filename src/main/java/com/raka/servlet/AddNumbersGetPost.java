package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNumbersGetPost extends HttpServlet {
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int result = a + b;
		
		PrintWriter writer = res.getWriter();
		writer.println("Result of GET/POST request = " + result);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
	
		int result = a + b;
	
		PrintWriter writer = res.getWriter();
		writer.println("Data Posted Successfully!");
		writer.println("Result after GET/POST request = " + result);
}

}

package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareHttpSession extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("SquareHttpSession servlet called");
		
		PrintWriter writer = res.getWriter();
		writer.println("Using HttpSession");
		
		HttpSession session = req.getSession();
		
		int sum = (int)session.getAttribute("sum");
		writer.println("Sum of numbers = " + sum);
		
		int square = sum * sum;
		writer.println("Square of sum = " + square);
		
	}
}

package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareSendRedirect extends HttpServlet {
	
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter writer = res.getWriter();
		System.out.println("SquareSendRedirect servlet Called");
		
		int sumResult = Integer.parseInt(req.getParameter("sumResult"));
		writer.println("Sum of numbers = " + sumResult);
		
		int square = sumResult * sumResult;
		writer.println("Square of sum of numbers = " + square);
	}

}

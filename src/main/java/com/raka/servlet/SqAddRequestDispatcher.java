package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqAddRequestDispatcher extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int sumResult = a + b;
		
		PrintWriter writer = res.getWriter();
		System.out.println("SqAddRequestDispatcher servlet called");
		writer.println("Add of numbers = " + sumResult);
		
		req.setAttribute("sumResult", sumResult);
		
		RequestDispatcher rd = req.getRequestDispatcher("rd-square");
		rd.forward(req, res);
	}

}

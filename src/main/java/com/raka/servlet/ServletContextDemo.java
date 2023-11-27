package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter writer = res.getWriter();
		
		writer.print("Radhe Radhe, ");
		
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		
		writer.println(name);
	}
}

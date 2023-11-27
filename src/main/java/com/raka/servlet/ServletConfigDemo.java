package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter writer = res.getWriter();
		
		writer.print("Hey, ");
		
		ServletConfig cfg = getServletConfig();
		String name = cfg.getInitParameter("name");
		
		writer.print(name);
	}
}

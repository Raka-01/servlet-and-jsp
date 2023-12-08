package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addStudent")
public class AddStudent extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("AddStudent Servlet called");
		PrintWriter out = res.getWriter();
		
		int sid = Integer.parseInt(req.getParameter("sid"));
		String name = req.getParameter("sname");
		
		out.println("Name - " + name);
	}
}

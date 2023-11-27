package com.raka.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/call2")
public class AnnotatedServlet2 extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("AnnotatedServlet2 called");
	}

}

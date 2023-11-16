package com.raka.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareCookie extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("SquareCookie servlet called");
		int sum = 0;
		
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter writer = res.getWriter();
		writer.println("Using Cookies");
		writer.println("Sum of numbers = " + sum);
		
		int square = sum * sum;
		writer.println("Square of sum = " + square);
	}

}

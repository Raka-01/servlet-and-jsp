package com.raka.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl")
public class DemoJSTL extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = "Radhe";
		
		Student student = new Student(1, "Rakesh");
		
		List<Student> students = Arrays.asList(new Student(2, "Ram"), new Student(3, "Krishna"), new Student(4, "Sita"), new Student(5, "Radha"));
		
		req.setAttribute("label", name);
		req.setAttribute("student", student);
		req.setAttribute("students", students);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}

}

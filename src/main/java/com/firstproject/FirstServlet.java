package com.firstproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
      
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		  int a=Integer.parseInt(req.getParameter("num1"));
		  int b=Integer.parseInt(req.getParameter("num2"));
		  
		  int c= a+b;
		  
		  System.out.println("Result is :"+c);
		  
		  PrintWriter out= res.getWriter();
		  out.println("Result is :"+c);
	}
}

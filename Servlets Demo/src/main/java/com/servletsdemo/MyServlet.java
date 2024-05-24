package com.servletsdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;




public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		PrintWriter out = response.getWriter();
		out.print("Hi");
		
		ServletConfig cg= getServletConfig();
		String str = cg.getInitParameter("phone");
		out.println(str);
		
		
		
	}
}

package com.teja.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//getting a writer object to print something, this is must to print
		PrintWriter out = res.getWriter();
		out.println("square servlet is called");
	}
}

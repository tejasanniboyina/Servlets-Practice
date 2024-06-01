package com.teja.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		//getParameter will give  a String value 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		k = k*k;
		
		res.sendRedirect("sq?k="+k);
		
		//to call another servlet  from here , we have 2 options
		// 1) Request Dispatcher 2)Redirect
		
		//getReuestDispatcher() gives the object of RequestDispatcher
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
	}
}

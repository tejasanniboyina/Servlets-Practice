package com.teja.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		//getParameter will give  a String value 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		k = k*k;
		

		
		//to call another servlet  from here , we have 2 options
		// 1) Request Dispatcher 2)Redirect 
		//getReuestDispatcher() gives the object of RequestDispatcher
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		//sending data using session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		//sending data using Cookie, cookie is a class
		Cookie cookie = new Cookie("k",k+""); //Cookie takes 2 string parameters so we added "" for int value k
		res.addCookie(cookie );
		
		res.sendRedirect("sq");
	}
}

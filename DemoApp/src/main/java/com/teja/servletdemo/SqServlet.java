package com.teja.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//getting data using session
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
		
		int k = 0;
		//getting data using cookie
		Cookie cookies[]= req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("k"))
			k =Integer.parseInt(c.getValue());
		}
		PrintWriter out = res.getWriter();
		out.println("the ressult is "+k);
		
		
	}
}

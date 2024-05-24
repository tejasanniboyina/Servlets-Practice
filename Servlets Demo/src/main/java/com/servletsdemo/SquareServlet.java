package com.servletsdemo;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k =Integer.parseInt(c.getValue()) ;
			}
		}
		//session
		/*HttpSession session = req.getSession();
		k = (int)session.getAttribute("k");*/
		 k= k*k;
		PrintWriter out = res.getWriter();
		out.println("the result is "+k);
		
		
	}


}

package com.servletsdemo;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import java.io.PrintWriter;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		// to send data from one servlet to another servlet 
		// sessio management
		//req.setAttribute("k", k);
		
		
		
		//ccookies
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		
		//using send Redirect 
		res.sendRedirect("sq");
		//res means sending response to the client
		//using session
		/*HttpSession session = req.getSession();
		session.setAttribute("k", k);*/
		
		//getWritter returns printwriter
		//PrintWriter out = res.getWriter();
		
		//to call another seervlet frm a servlet
		//Request Dispatcher and send redirect
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
			//rd.forward(req,res);
		}
}

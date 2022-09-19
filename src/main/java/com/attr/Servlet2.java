package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//gettting all the cookies
		
	Cookie[] cookies =	request.getCookies();
		boolean f= false;
		String name = "";
         
		
		if(cookies == null) {
			out.println("<h1>You are new user go to home page and submit your name ");
			return;
		}else {
			for(Cookie c : cookies) {
			String tname  =	c.getName();
			 if(tname.equals("user_name")) {
				 f=true;
				 name=c.getValue();
			 }
			}
			
		}
		
		if(f) {
		out.println("<h1>Hello , " + name + " Welcome to my website servlet2");
		out.println("Thankyou.........");
		}else {
			out.println("<h1>You are new user go to home page and submit your name sorry");
		}
	}

}

package com.start;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome to register Servlet</h2>");
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String cond = request.getParameter("condition");
//	    out.println(cond);
	    if(cond!=null)
	    {
		if(cond.equals("checked")) {
			out.println("<h2> Name : " + name + "</h2>");
			out.println("<h2> Name : " + password + "</h2>");
			out.println("<h2> Name : " + email + "</h2>");
			out.println("<h2> Name : " + gender + "</h2>");
			out.println("<h2> Name : " + course + "</h2>");
		
			
			//yaha par hum jdbc ke sath database main entry kr skte h save;
		
		   //save to db;
			
			RequestDispatcher rd= request.getRequestDispatcher("success");
			rd.forward(request, response);
		
		}
		else {
			out.println("<h2>You have not accepted term and conditon</h2>");
		
		}
	    }else {
	    	out.println("<h2>You have not accepted term and conditon</h2>");
	        //i want to inlcude output of index.html
	    	
	    	///get the object of requestdistacher
	    	
	    	RequestDispatcher rd = request.getRequestDispatcher("detail.jsp");
	    	rd.include(request, response);
	    }
	
	}

}

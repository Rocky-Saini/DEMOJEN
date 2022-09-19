package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s2
 */
@WebServlet("/s2")
public class s2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
	    int nn1=Integer.parseInt(request.getParameter("n1"));
	    int nn2=Integer.parseInt(request.getParameter("n2"));
	    
	    int p= nn1*nn2;
	    
	    int sum=(int) request.getAttribute("sum");
	   out.println("<h1>Sum is equal to :" +sum+"</h1>");
	   out.println("<h1>Sum is equal to :" +p+"</h1>");
	   
	}



}

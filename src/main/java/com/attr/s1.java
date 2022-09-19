package com.attr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s1")
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1= request.getParameter("n1");
		String n2= request.getParameter("n2");
	
	  int nn1=Integer.parseInt(n1);
	  int nn2=Integer.parseInt(n2);
	  
	  int s = nn1+nn2;
	  
	  //set attribute
	  request.setAttribute("sum",s);

	//request request dispatcher
	  
	 RequestDispatcher rd = request.getRequestDispatcher("s2");
	 rd.forward(request, response);
	
	}

	
}

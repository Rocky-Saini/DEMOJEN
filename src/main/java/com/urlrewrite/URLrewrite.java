package com.urlrewrite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class URLrewrite
 */
@WebServlet("/URLrewrite")
public class URLrewrite extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       //name fetch
       String name = request.getParameter("user_name");
       out.println("<h1>Your name is : " +name);
       
//       out.println("<a href='serv2?user="+name+"'>Go to second servlet</a>");
       
        out.println(""
        		+ "<form action='serv2' >"
        		+ "<input type='hidden' name='user_name' value='"+name+"'/>"
        		+ "<button type='submit'>Go to second serv</button>"
        		
        		+ "</form>");
	}


}

package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        out.println("<h1>Hello , " + name + " Welcome to my website");
        out.println("<h1><a href='Servlet2'>GO to servlet2</a></h2>");
        
        
        //Create a cookie
        
        Cookie c = new Cookie("user_name", name);
        
        response.addCookie(c);
        
	}

}

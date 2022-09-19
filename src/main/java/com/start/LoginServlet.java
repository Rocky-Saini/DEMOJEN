package com.start;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Starter")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunita","root","123456");
			    String n=request.getParameter("username");
			    String p = request.getParameter("password");
			    
			PreparedStatement pd = con.prepareStatement("select uname from login where uname=? and password=?");
			
			pd.setString(1, n);
			pd.setString(2, p);
			
		    ResultSet rs=pd.executeQuery();
		    
		    
		    if(rs.next()) {
		    	RequestDispatcher rd = request.getRequestDispatcher("detail.jsp");
		    	rd.forward(request, response);
		    }else {
		    	out.println("<font color-red size=18>Login Failded!!<br>");
		    	out.println("<a href=login.jsp>Try Again!!</a>");
		    }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

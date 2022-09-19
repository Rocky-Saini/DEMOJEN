package com.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Dquery")
@MultipartConfig
public class Dquery extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		// getting all the incoming details from the request

	

		//coneection
		try {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","123456");
				
				String name = request.getParameter("user_name");
				String password = request.getParameter("user_password");
				String email = request.getParameter("user_email");
                //for image
				Part part = request.getPart("image");
				String filename = part.getSubmittedFileName();
				
			    
			PreparedStatement pd = con.prepareStatement("insert into user(name,password,email,imageName) values(?,?,?,?)");
		
			pd.setString(1, name);
			pd.setString(2, password);
			pd.setString(3, email);
			pd.setString(4, filename);
			
		    pd.executeUpdate();
		    
		    //upload file on folder
		    InputStream is = part.getInputStream();
		    byte[] data = new byte[is.available()];
		    
		    is.read(data);
		    
		    String path = request.getRealPath("/")+"images"+File.separator+filename;
		   
		    FileOutputStream fos = new FileOutputStream(path);
		    
		    fos.write(data);
		    fos.close();
		    out.println("done");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// query

		// ..........

	}

}

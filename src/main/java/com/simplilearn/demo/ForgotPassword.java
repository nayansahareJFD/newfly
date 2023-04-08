package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			  PrintWriter out = resp.getWriter();

			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			try {
				Methods dao=new Methods();
				HttpSession session=req.getSession();
				if(dao.changeAdminPassword(email,password)) {
					out.println("<h1> Password Changed Successfully</h1>");
				}
				else {
					out.println("<h1>Error while  Changing Password</h1>");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resp.sendRedirect("admin.html");
			
		}		
	
	
	
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
	
	
	
	
	
	
	

}
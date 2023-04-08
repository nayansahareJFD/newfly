package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		try {
			Methods dao = new Methods();

			if (dao.checkAdmin(email, password)) {
				System.out.println("ho gaya login....");
				out.println("ho gaya login....");
				RequestDispatcher rd= req.getRequestDispatcher("dashboard");
				rd.forward(req,resp);
				//resp.sendRedirect("dashboard");
			} else {
				out.print("<div style='text-align:center;'>");
				out.print("<h2>Please enter the user id and password correctly to login</h2>");
				out.print("<br>");
				out.println("<a href='index.html' class='button' style='background-color: blue; color: white; padding: 10px 20px; border-radius: 5px; text-decoration: none;'>Go back to home page</a>");
				out.print("<br>");
				out.print("<br>");
				out.print("<br>");
				out.print("<br>");
				out.println("<a href='admin.html' class='button' style='background-color: blue; color: white; padding: 10px 20px; border-radius: 5px; text-decoration: none;'>Go to Admin Page</a>");
				out.print("</div>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
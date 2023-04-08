package com.simplilearn.demo;


import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/list")
public class ListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();
		
		List<FlightDetails> list=session.createQuery("from FlightDetails").list();
		
		PrintWriter out=resp.getWriter();
		out.print("<h1>Product List</h1>");
		
		for(FlightDetails p:list) {
			out.print("<b>"+". "+p.getSource()+" "+p.getDestination()+" "+p.getAirline()+" "+p.getDate()+" "+p.getPrice()+" "+p.getTime()+"</b><br>");
			}
		
		
		out.print("<h1><a href=\"index.html\">back to home page</a></h1>");

		session.close();
	      factory.close();	
	}
	  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
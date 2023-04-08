package com.simplilearn.demo;

import java.io.IOException;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/SearchedFlightDetails")
public class SearchedFlightDetails extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

		String source=req.getParameter("source");
		String destination=req.getParameter("destination");
		String date=req.getParameter("date");
		String passengers=req.getParameter("passengers");
	
		try {
			Methods dao = new Methods();
			List<String[]> flights=dao.getAvailableFlights(source, destination, date);			
			HttpSession session=req.getSession();
			session.setAttribute("flights", flights);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		resp.sendRedirect("FlightList.jsp");
	}
	
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
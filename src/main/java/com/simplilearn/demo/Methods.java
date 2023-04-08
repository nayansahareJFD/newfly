package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Methods {
	
	public Connection con=null;
	public Statement st=null;
	

	public Methods() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/fly?"+ "user=root&password=nationaldefence");
		System.out.println("connection established with database");
		st=con.createStatement();
	}

	
	public boolean checkAdmin(String email, String password) {
		
		try {
			ResultSet rs=st.executeQuery("select * from admin where email='"+email+"' and password='"+password+"'");
			if(rs.next())
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	
	public boolean changeAdminPassword(String email, String password) {

		try {
			ResultSet rs=st.executeQuery("select * from admin where email='"+email+"'");
			if(!rs.next()) {
				return false;
			}
			st.execute("update admin set password='"+password+"' where email='"+email+"'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}





public List<String[]> getAvailableFlights(String  source, String destination, String date) {
		
		List<String[]> flights=new ArrayList<>();
		String query="SELECT * FROM flightdetails where  source='"+ source+"' and destination='"+destination+"' and date='"+date+"'";
		try {
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				String[] flight=new String[6];
				flight[0]=rs.getString("source");
				flight[1]=rs.getString("destination");
				flight[2]=rs.getString("airline");

				flight[3]=rs.getString("time");
				flight[4]=rs.getString("date");
				flight[5]=rs.getString("price");
				flights.add(flight);
				
			}return flights;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
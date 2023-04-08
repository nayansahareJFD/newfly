<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Book Flight</title>
	<style>
	body{	 background-image: url('https://th.bing.com/th?id=OIP.3kFTNDIN0xO1gwFtsDUukwHaEo&w=316&h=197&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2');background-size: cover;}
		form {
			width: 60%;
			margin: 50px auto;
			padding: 20px;
			background-color: #f2f2f2;
			box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
		}

		input[type="submit"] {
			background-color: #1e90ff;
			color: white;
			padding: 12px 20px;
			border: none;
			border-radius: 4px;
			cursor: pointer;
		}

		input[type="submit"]:hover {
			background-color: #008CBA;
		}

		h1 {
			text-align: center;
			margin-top: 50px;
			color: #1e90ff;
		}
		.name-email-phone input[type="text"],
		.name-email-phone input[type="email"],
		.name-email-phone input[type="tel"] {
			background-color: #f9f9f9;
			padding: 12px;
			border: 1px solid #ccc;
			border-radius: 4px;
			margin-bottom: 10px;
			width: 100%;
			box-sizing: border-box;
		}
	</style>
</head>
<body>
	<%
    String[] flights = null;
    String flightsParam = request.getParameter("flights");
    if (flightsParam != null) {
        flights = flightsParam.substring(1, flightsParam.length() - 1).split(", ");
    }

    String source = flights[0];
    String destination = flights[1];
    String airline = flights[2];
    String time = flights[3];
    String date = flights[4];
    String price = flights[5];
    
%>
	<h1>Book Flight</h1>
	<form action="Payment.jsp" method="post">
	    
	     enter personal details:-<br><br>
	    <div class="name-email-phone">
	        <label for="name">Name:</label>
		    <input type="text" id="name" name="name" required>
	        <br><br>
		    <label for="email">Email:</label>
		    <input type="email" id="email" name="email" required>
	        <br><br>
		    <label for="phone">Phone:</label>
		    <input type="tel" id="phone" name="phone" required><br><br>
	    </div>
		<label for="source">Source:</label>
		<input type="text" name="source" value="<%= source %>" readonly><br><br>
		<label for="destination">Destination:</label>
		<input type="text" name="destination" value="<%= destination %>" readonly><br><br>
		<label for="airline">Airline:</label>
		<input type="text" name="airline" value="<%= airline %>" readonly><br><br>
		<label for="time">Time:</label>
		<input type="text" name="time" value="<%= time %>" readonly><br><br>
		<label for="date">Date:</label>
		<input type="text" name="date" value="<%= date %>" readonly><br><br>
		<label for="price">Price:</label>
		<input type="text" name="price" value="<%= price %>" readonly><br><br>
		<input type="submit" value="Make Payment to Confirm Booking">
	
	</form>
	

</body>
</html>
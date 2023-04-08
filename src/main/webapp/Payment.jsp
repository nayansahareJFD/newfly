<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Payment</title>
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
<body><h1>Payment Confirmation</h1>
<form action='Confirmation.jsp' method="post">
    <h2>Personal Details</h2>
    <div class="name-email-phone">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="<%= request.getParameter("name") %>" readonly>
        <br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%= request.getParameter("email") %>" readonly>
        <br><br>
        <label for="phone">Phone:</label>
        <input type="tel" id="phone" name="phone" value="<%= request.getParameter("phone") %>" readonly><br><br>
    </div>
    <h2>Flight Details</h2>
    <label for="source">Source:</label>
    <input type="text" id="source" name="source" value="<%= request.getParameter("source") %>" readonly><br><br>
    <label for="destination">Destination:</label>
    <input type="text" id="destination" name="destination" value="<%= request.getParameter("destination") %>" readonly><br><br>
    <label for="airline">Airline:</label>
    <input type="text" id="airline" name="airline" value="<%= request.getParameter("airline") %>" readonly><br><br>
    <label for="time">Time:</label>
    <input type="text" id="time" name="time" value="<%= request.getParameter("time") %>" readonly><br><br>
    <label for="date">Date:</label>
    <input type="text" id="date" name="date" value="<%= request.getParameter("date") %>" readonly><br><br>
    <label for="price">Price:</label>
    <input type="text" id="price" name="price" value="<%= request.getParameter("price") %>" readonly><br><br>
    <input type="submit" value="Confirm Payment">
</form>
	<hr>
	<h2>Payment Portal</h2>
	<p>This is a dummy payment portal that always confirms the payment and displays a success message.</p>
	<p><b>Total amount:</b> <%= request.getParameter("price") %></p>
	<p><b>Payment method:</b> Visa ending in 1234</p>

	
	
</body>
</html>
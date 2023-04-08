<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Booking Confirmation</title>
	<style>
		body {
		 background-image: url('https://th.bing.com/th?id=OIP.3kFTNDIN0xO1gwFtsDUukwHaEo&w=316&h=197&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2');background-size: cover;
			width: 60%;
			margin: 50px auto;
			padding: 20px;
			background-color: #f2f2f2;
			box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
		}

		h1 {
			text-align: center;
			color: #1e90ff;
		}

		table {
			margin: 20px auto;
			border-collapse: collapse;
			width: 100%;
		}

		th, td {
			padding: 8px;
			text-align: left;
			border-bottom: 1px solid #ddd;
		}

		.confirmation {
			margin-top: 20px;
			text-align: center;
			color: #1e90ff;
		}

	</style>
</head>
<body>
	<h1>Booking Confirmation</h1>
	<table>
		<tr>
			<th>Personal Details:</th>
			<th>Flight Details:</th>
		</tr>
		<tr>
			<td>Name: <%= request.getParameter("name") %></td>
			<td>Source: <%= request.getParameter("source") %></td>
		</tr>
		<tr>
			<td>Email: <%= request.getParameter("email") %></td>
			<td>Destination: <%= request.getParameter("destination") %></td>
		</tr>
		<tr>
			<td>Phone: <%= request.getParameter("phone") %></td>
			<td>Airline: <%= request.getParameter("airline") %></td>
		</tr>
		<tr>
			<td></td>
			<td>Time: <%= request.getParameter("time") %></td>
		</tr>
		<tr>
			<td></td>
			<td>Date: <%= request.getParameter("date") %></td>
		</tr>
		<tr>
			<td></td>
			<td>Price: <%= request.getParameter("price") %></td>
		</tr>
	</table>
	<div class="confirmation">
		<h2>Congratulations! You have successfully booked your ticket.</h2>
		<p>Thank you for choosing our airline. We wish you a pleasant journey.</p>
	</div>
</body>
</html>
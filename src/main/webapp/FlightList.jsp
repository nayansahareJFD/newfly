<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Flight List</title>
	<style>
body{	 background-image: url('https://th.bing.com/th?id=OIP.3kFTNDIN0xO1gwFtsDUukwHaEo&w=316&h=197&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2');background-size: cover;}
		table {
			border-collapse: collapse;
			width: 80%;
			margin: 50px auto;
			background-color: #f2f2f2;
			box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
		}

		th, td {
			text-align: left;
			padding: 12px;
		}

		th {
			background-color: #1e90ff;
			color: white;
		}

		tr:nth-child(even) {
			background-color: #f2f2f2;
		}

		tr:hover {
			background-color: #d9d9d9;
		}

		a {
			text-decoration: none;
			color: #1e90ff;
			font-weight: bold;
		}

		h1 {
			text-align: center;
			margin-top: 50px;
			color: #1e90ff;
		}
	</style>
</head>
<body>
<%
    List<String[]> flights = (List<String[]>) session.getAttribute("flights");
    if (flights != null) {
%>
    <h1>Available Flights</h1>
    <table>
        <tr>
            <th>Source</th>
            <th>Destination</th>
            <th>Airline</th>
            <th>Time</th>
            <th>Date</th>
            <th>Price</th>
            <th></th>
        </tr>
        <%
            for (String[] flight : flights) {
        %>
            <tr>
                <td><%= flight[0] %></td>
                <td><%= flight[1] %></td>
                <td><%= flight[2] %></td>
                <td><%= flight[3] %></td>
                <td><%= flight[4] %></td>
                <td><%= flight[5] %></td>
                <td>
                    <form action="BookFlight.jsp" method="post">
                        <input type="hidden" name="flights" value="<%= Arrays.toString(flight) %>">
                        <input type="submit" value="Book Now">
                    </form>
                </td>
            </tr>
        <%
            }
        %>
    </table>
<%
    } else {
%>
    <h1>There are no available flights</h1>
<%
    }
%>

</body>
</html>
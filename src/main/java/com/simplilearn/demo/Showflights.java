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

@WebServlet("/Showflights")
public class Showflights extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        List<FlightDetails> list = session.createQuery("from FlightDetails").list();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Flight Details</title>");
        out.print("<style>");
        out.print("body {background-image: url('https://th.bing.com/th?id=OIP.3kFTNDIN0xO1gwFtsDUukwHaEo&w=316&h=197&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2'); background-size: cover;}");
        out.print("table {");
        out.print("  font-family: arial, sans-serif;");
        out.print("  border-collapse: collapse;");
        out.print("  width: 100%;");
        out.print("}");

        out.print("td, th {");
        out.print("  border: 1px solid #dddddd;");
        out.print("  text-align: left;");
        out.print("  padding: 8px;");
        out.print("}");

        out.print("tr:nth-child(even) {");
        out.print("  background-color: #dddddd;");
        out.print("}");
        out.print("</style>");
        out.print("</head>");
        out.print("<body>");

        out.print("<table>");
        out.print("<tr>");
        out.print("<th>Source</th>");
        out.print("<th>Destination</th>");
        out.print("<th>Airline</th>");
        out.print("<th>Time</th>");
        out.print("<th>Price</th>");
        out.print("<th>Date</th>");
        out.print("</tr>");

        for (FlightDetails flight : list) {
            out.print("<tr>");
            out.print("<td>" + flight.getSource() + "</td>");
            out.print("<td>" + flight.getDestination() + "</td>");
            out.print("<td>" + flight.getAirline() + "</td>");
            out.print("<td>" + flight.getTime() + "</td>");
            out.print("<td>" + flight.getPrice() + "</td>");
            out.print("<td>" + flight.getDate() + "</td>");
            out.print("</tr>");
        }
        session.close();

        out.print("</table>");

        out.print("</body>");
        out.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
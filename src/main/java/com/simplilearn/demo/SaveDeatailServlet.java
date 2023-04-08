package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/save")
public class SaveDeatailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
     
        String source = req.getParameter("source");
        String destination = req.getParameter("destination");
        String airline = req.getParameter("airline");
        String time = req.getParameter("time");
        BigDecimal price = new BigDecimal(req.getParameter("price"));
        String date = req.getParameter("date");

        SessionFactory factory = null;
        Session session= null;
        Transaction tx= null;
        try {
            factory = HibernateUtil.getSessionFactory();
            session = factory.openSession();
            tx = session.beginTransaction();
			 
            FlightDetails flightDetails = new FlightDetails(source, destination, airline, time, price, date);
		     
            session.save(flightDetails);
            tx.commit();
			 
            session.close();
            factory.close();
            
            // Send success message to client
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Data Added Successfully</title>");
            out.println("<style>");
            out.println("body {");
            out.println("  background-image: url('https://th.bing.com/th?id=OIP.3kFTNDIN0xO1gwFtsDUukwHaEo&w=316&h=197&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2');");
            out.println("  background-size: cover;");
            out.println("  display: flex;");
            out.println("  justify-content: center;");
            out.println("  align-items: center;");
            out.println("  height: 100vh;");
            out.println("}");
            out.println(".message {");
            out.println("  background-color: #f1f1f1;");
            out.println("  border-radius: 5px;");
            out.println("  padding: 20px;");
            out.println("  font-size: 24px;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"message\">Data Added Successfully</div>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

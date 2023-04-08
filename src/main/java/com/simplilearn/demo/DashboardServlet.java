package com.simplilearn.demo;

import java.io.IOException;

import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet  {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // to print in web page
        PrintWriter out=resp.getWriter();
        
        
        // to read html code and print it
        resp.setContentType("text/html");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Dashboard</title>");
        out.print("<style>");
        out.print("body {background-image: url('https://th.bing.com/th?id=OIP.3kFTNDIN0xO1gwFtsDUukwHaEo&w=316&h=197&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2'); background-size: cover;}");
        out.print(".button {");
        out.print("  background-color: #008CBA;");
        out.print("  border: none;");
        out.print("  color: white;");
        out.print("  padding: 15px 32px;");
        out.print("  text-align: center;");
        out.print("  text-decoration: none;");
        out.print("  display: inline-block;");
        out.print("  font-size: 16px;");
        out.print("  margin: 4px 2px;");
        out.print("  cursor: pointer;");
        out.print("}");
        out.print("a {color: #008CBA; text-decoration: none;}");
        out.print("</style>");
        out.print("</head>");
        out.print("<body>");
        
                            out.print("<h1>WELCOME </h1>");
                            out.print("<br>");
                            out.print("<br>");
                            out.print("<br>");
                            out.print("<br>");
                            out.print("<br>");
                            out.print("<br>");
                            out.println("<a href='AddingFlights.html' class='button'>AddFlight</a>");
                            out.print("<br>");
                            out.print("<br>");
                            out.println("<a href='Showflights' class='button'>ShowFlights</a>");
                            out.print("<br>");
                            out.print("<br>");
                            out.println("<a href='ForgotPassword.jsp' class='button'>ChangePassword</a>");
                            out.print("<br>");
                            out.print("<br>");
                            out.println("<a href='index.html' class='button'>go back to home page</a>" );
                            
                            
                            
        out.print("</body>");
        out.print("</html>");
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
            doGet(req, resp);
    }
    

}

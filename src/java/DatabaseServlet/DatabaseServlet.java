package DatabaseServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class DatabaseServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String connectionURL = "jdbc:derby://localhost:1527/EmployeeDB";
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            Connection conn = DriverManager.getConnection(connectionURL, "root", "root");
    //Declare the Empdbcomponent object 
            Empdbcomponent db = new Empdbcomponent();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DatabaseServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DatabaseServlet at " + request.getContextPath()
                    + "</h1>");

//Create the Insert record button and open “insertrecord.jsp”
            out.println("<form action=\"insertrecord.jsp\" method=\"post\">");
            out.println("<input type=\"submit\" value=\"Insert Record\">");
            out.println("</form>");

//Create the Update record button and open “editrecord.jsp”
            out.println("<form action=\" editrecord.jsp\" method=\"post\">");

//Display the table format
            out.println("<table border=\"1\"1>");
            out.println("<tr><td>First Name</td><td>Last Name</td>");
            out.println("<td>Birth Date</td><td>Salary</td></tr>");

//Create the ResultSet object for getting the information of employee
            ResultSet rs;

//Assign the rs to use Empdbcomponent method fetchRecords to execute the Query
            rs = db.fetchRecords(conn);

            while (rs.next()) {
//Display the database record by using tr, td and rs 
                out.println("<tr><td>");
                out.println(rs.getString("FIRSTNAME") + "</td>");
                out.println("<td>" + rs.getString("LASTNAME") + "</td>");
                out.println("<td>" + rs.getString("BIRTHDATE") + "</td>");
                out.println("<td>" + rs.getString("SALARY") + "</td>");
                out.println("<td><input type=\"submit\" value=\"Edit Record\">");
                out.println("</tr>");
                out.println("</form>");
            }
            rs.close();
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            System.out.println("Connect failed ! ");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find the driver! ");
        }
    }
}

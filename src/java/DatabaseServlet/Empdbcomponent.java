/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseServlet;

import java.sql.*;

/**
 *
 * @author ckc
 */
public class Empdbcomponent {

    public ResultSet fetchRecords(Connection conn) throws SQLException, ClassNotFoundException {
        String sql_search = "SELECT * FROM EMPLOYEE";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql_search);
        return rs;
    }

    public int insertRecords(Connection conn, Employee emp) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO employee VALUES (" + emp.getId() + ",'" + emp.getFirstname()+ "','" + emp.getLastname() + "'," + emp.getBirthdate()+ ")";
        Statement st = conn.createStatement();
        int rs = st.executeUpdate(query);
        return rs;
    }

    public int updateRecord(Connection conn, Employee emp) throws ClassNotFoundException, SQLException {
        String query = "UPDATE employee SET firstname ='" + emp.getFirstname()+ "', lastname = '" + emp.getLastname()+ "' , salary = " + emp.getSalary()+ "  WHERE id = " + emp.getId() + "";
        Statement st = conn.createStatement();
        int rs = st.executeUpdate(query);
        return rs;
    }
}

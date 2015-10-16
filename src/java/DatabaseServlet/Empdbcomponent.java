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

    public int insertRecords(Connection conn, Employee emp) throws SQLException {
        //String query = "INSERT INTO employee VALUES (" + emp.getId() + ",'" + emp.getFirstname()+ "','" + emp.getLastname() + "'," + emp.getBirthdate()+ ")";
        PreparedStatement pst = conn.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?,?,?)");
        pst.setInt(1, emp.getId());
        pst.setString(2, emp.getFirstname());
        pst.setString(3, emp.getLastname());
        pst.setString(4, emp.getBirthdate());
        pst.setString(5, emp.getSalary());
        int rs = pst.executeUpdate();
        
        //Statement st = conn.createStatement();
        //int rs = st.executeUpdate(query);
        return rs;
    }

    public int updateRecord(Connection conn, Employee emp) throws ClassNotFoundException, SQLException {
        //String query = "INSERT INTO employee VALUES (" + emp.getId() + ",'" + emp.getFirstname()+ "','" + emp.getLastname() + "'," + emp.getBirthdate()+ ")";
        PreparedStatement pst = conn.prepareStatement("UPDATE EMPLOYEE SET FIRSTNAME= ? , LASTNAME= ?, BIRTHDATE= ?, SALARY= ? where ID= ?");
        pst.setString(1, emp.getFirstname());
        pst.setString(2, emp.getLastname());
        pst.setString(3, emp.getBirthdate());
        pst.setString(4, emp.getSalary());
        pst.setInt(5, emp.getId());
        int rs = pst.executeUpdate();
        
        //Statement st = conn.createStatement();
        //int rs = st.executeUpdate(query);
        return rs;
    }
}

<%-- 
    Document   : insertrecord
    Created on : 2015/10/15, 上午 12:25:03
    Author     : ckc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <!--- <sql:setDataSource url="jdbc:derby://localhost:1527/EmployeeDB" user="root"  password="root" driver="org.apache.derby.jdbc.ClientDriver"
                   var="mydata"/>
 
<sql:query sql="SELECT * FROM EMPLOYEE WHERE ID =${ID}" dataSource="${mydata}" var="result"/> -->
        
        
        <h1>Database Administration - Edit Page</h1>
        
        <p>Please input the following data to update the new record</p>
        
        <form action="DatabaseServletEdit" method="post">
            <label>ID : </label> <input type="text" name="ID" value="<%= request.getParameter("ID")%>"><p>
                <label>First Name : </label> <input type="text" name="fname" value="<%= request.getParameter("fname")%>"><p>
            <label>Last Name : </label> <input type="text" name="lname" value="<%= request.getParameter("lname")%>"><p>
            <label>Birthday : </label><input type="text" name="bday" value="<%= request.getParameter("bday")%>"><p>
            <label>Salary : </label><input type="text" name="sal" value="<%= request.getParameter("sal")%>"><p>
                <input type="submit" value="Update Record"> <input type="Reset" value="Reset">
        </form>
    </body>
</html>

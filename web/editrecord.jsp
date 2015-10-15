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
        <h1>Database Administration - Edit Page</h1>
        
        <p>Please input the following data to update the new record</p>
        
        <form action="" method="post">
            <label>ID : </label> <input type="text" name="ID" value="<%= request.getParameter("ID")%>"><p>
                <label>First Name : </label> <input type="text" name="fname" value=""><p>
            <label>Last Name : </label> <input type="text" name="lname" value=""><p>
            <label>Birthday : </label><input type="text" name="bday" value=""><p>
            <label>Salary : </label><input type="text" name="sal" value=""><p>
                <input type="submit" value="Update Record"> <input type="Reset" value="Reset">
        </form>
    </body>
</html>

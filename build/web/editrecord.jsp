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
        <form action="" method="post">
            <label>ID : </label> <input type="text" name="ID"><p>
            <label>First Name : </label> <input type="text" name="fname"><p>
            <label>Last Name : </label> <input type="text" name="lname"><p>
            <label>Birthday : </label><input type="text" name="bday"><p>
            <label>Salary : </label><input type="text" name="sal"><p>
                <input type="submit" value="Update Record"> <input type="Reset" value="Reset">
        </form>
    </body>
</html>

<%-- 
    Document   : newjsp
    Created on : Sep 2, 2024, 1:14:12 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>Enter Emp Details</center></h1>
        <form action="LoginProcess.jsp">
        <br>
<!--        Name: <input type="text" placeholder="Enter name" name="username">
        <br><br>-->
        Email:  <input type="email" name="Email" placeholder="Enter Email">
        <br><br>
        Pass: <input type="text" name="pass" placeholder="Enter password">
        <br><br>
       
        <input type="submit" value="login"/>
        </form>
    </body>
</html>

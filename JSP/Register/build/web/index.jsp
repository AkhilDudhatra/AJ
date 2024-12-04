<%-- 
    Document   : index
    Created on : Sep 5, 2024, 9:33:06 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    <title>Form Centering</title>
   
    </head>
    <body align="center">
        <h1> REGISTER FORM </h1>
         <form action="Process.jsp" >
            NAME: <input type="text" name="name" >
            <br><br>
            EMAIL: <input type="text" name="email">
             <br><br>
            PASSWORD: <input type="password" name="password">
             <br><br>
            <input type="submit" value="register"/>
        </form>
    </body>
</html>

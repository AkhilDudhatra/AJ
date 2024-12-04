.0<%-- 
    Document   : index.jsp
    Created on : Sep 23, 2024, 12:27:24 PM
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
        <jsp:forward page="print.jsp">
        <jsp:param name="name" value="java"/>
    </jsp:forward>
    </body>
</html>

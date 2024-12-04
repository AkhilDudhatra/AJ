<%-- 
    Document   : print
    Created on : Sep 23, 2024, 12:19:55 PM
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
        <% out.print("Today is : "+java.util.Calendar.getInstance().getTime());%>
        <%= request.getParameter("name") %>        
    </body>
</html>

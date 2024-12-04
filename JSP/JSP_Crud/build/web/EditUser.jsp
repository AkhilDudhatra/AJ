<%-- 
    Document   : EditUser
    Created on : Sep 12, 2024, 11:42:04 AM
    Author     : Administrator
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" import="bean.userdao"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <jsp:useBean id="u" class="bean.Stud"></jsp:useBean>  
        <jsp:setProperty property="*" name="u"/>  
       <%  
            int i=userdao.update(u);
            System.out.println(i);
           // System.out.print(i);
            response.sendRedirect("ViewUserForm.jsp");
       %>
       
    </body>
</html>

<%-- 
    Document   : deleteUser
    Created on : Sep 12, 2024, 11:32:50 AM
    Author     : Administrator
--%>

<%@page import="bean.userdao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="u" class="bean.Stud"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
                userdao.delete(u);  
                response.sendRedirect("ViewUserForm.jsp");  
            %>
    </body>
</html>

<%-- 
    Document   : adduser
    Created on : Sep 10, 2024, 1:17:47 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="bean.userdao"%>
<jsp:useBean id="u" class="bean.Stud"></jsp:useBean>
<jsp:setProperty name="u" property="*"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="userform.html"></jsp:include>
        <%
            int i=userdao.save(u);
            if(i>0)
            {
                response.sendRedirect("add_user_success.jsp");
                
            }
            else
            {
                response.sendRedirect("add_user_error.jsp");
            }
        %>
    </body>
</html>

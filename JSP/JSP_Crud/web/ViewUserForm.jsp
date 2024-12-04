<%-- 
    Document   : ViewUserForm
    Created on : Sep 12, 2024, 10:59:40 AM
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
         <%@ page import="bean.*,java.util.*,bean.userdao"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <h1>User List</h1>
        <%
             List<Stud> list = userdao.getAllRecords();
             request.setAttribute("list",list);          
        %>
        <table border="1" width="90%">
            <tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Gender</th><th>Country</th></tr>
            <c:forEach items="${list}" var="u">
                <tr><td>${u.getId()}</td>
                    <td>${u.getName()}</td>
                    <td>${u.getPassword()}</td>
                    <td>${u.getEmail()}</td>
                    <td>${u.getGender()}</td>
                    <td>${u.getCountry()}</td>
                    <td><a href="EditForm.jsp?id=${u.getId()}">Edit</a></td>
                    <td><a href="deleteUser.jsp?id=${u.getId()}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <br/><a href="userform.html">Add New User</a>
    </body>
</html>

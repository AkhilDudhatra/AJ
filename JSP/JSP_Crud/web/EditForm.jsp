<%-- 
    Document   : EditForm
    Created on : Sep 13, 2024, 10:53:02 AM
    Author     : Administrator
--%>

<%@page import="bean.userdao"%>   
<%@page import="bean.Stud"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%  
        String id=request.getParameter("id");
        System.out.println(id);
        Stud u=userdao.getRecordById(Integer.parseInt(id));
       %>
       <h1>
           Edit Form
       </h1>
       <form action="EditUser.jsp" method="post">
           <in
               put type="hidden" name="id" value="<%= u.getId() %>"/>
           <table>
               <tr><td>Name: </td><td><input type="text" name="name" value="<%= u.getName()%>"/></td></tr>
               <tr><td>Password: </td><td><input type="password" name="password" value="<%=u.getPassword()%>"/></td></tr>
               <tr><td>Email: </td><td><input type="email" name="email" value="<%=u.getEmail()%>"/></td></tr>
               <tr><td>Gender: </td><td><input type="radio" name="gender" value="male"/>Male
                       <input type="radio" name="gender" value="female"/>Female </td></tr>
               <tr><td>Country: </td>
                   <td><select name="country">
                           <option>India</option>
                           <option>US</option>
                            <option>UK</option>
                            <option>Germany</option>
                            <option>Other</option>
                        </select>
                   </td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="Edit User"></td>
                </tr>
            </table>
       </form>
    </body>
</html>

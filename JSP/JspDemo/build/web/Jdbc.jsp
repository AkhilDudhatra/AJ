<%-- 
    Document   : Jdbc
    Created on : Sep 3, 2024, 1:06:08 PM
    Author     : Administrator
--%>

<%--<%@page import="java.lang.Class.forName(String)"%>--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
    


<%!
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  String url = "jdbc:mysql://localhost:3306/day1 ";
  String user = "root";
  String pass = "";
%>
<%
    try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url,user, pass);
        if(con!=null)
        {
            out.println("Successfully Connected to " + "Mysql");
            stmt = con.createStatement();
            rs= stmt.executeQuery("select *from stud");
        }
        while(rs.next())
        {
            
        
%>
    <tr>
        <td><%=rs.getString(1)%></td>
        <td><%=rs.getString(2)%></td>
    </tr>
<%
        }
    }  
    catch(Exception e)
    {
        out.println("Exception: " + e.getMessage());
    }
    finally{
            try{
                    
               }
               catch(Exception e)
               {
                    
               }
            }
%>   
    </body>
</html>
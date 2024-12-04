<%-- 
    Document   : first
    Created on : Sep 4, 2024, 11:07:16 AM
    Author     : Administrator
--%>



<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%!
  Connection con=null;
  Statement stmt=null;
  ResultSet rs=null;
  String url = "jdbc:mysql://localhost:3306/day1 ";
  String user = "root";
  String pass = "";
  String str,Name,sql;
  int Roll,count;
  
%>
<%
    try{
        str = request.getParameter("first");
        Name = request.getParameter("second");
        Roll= Integer.parseInt(str);
        sql= "insert into stud values(" + Roll +", " + Name + ")";
        
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url,user, pass);
        if(con!=null)
        {
            out.println("Successfully Connected to " + "Mysql");
        }
        stmt = con.createStatement();
        count= stmt.executeUpdate(sql);
        
        if(count==1)
            out.println("Successfully added"+"<br>");
        else
            out.println("data is not added"+"<br>");
        
    }catch(Exception e)
    {
         out.println("Exception: " + e.getMessage());
    }
    finally{
        try{
            if(con !=null)
            {
                con.close();
                
            }
        }
        catch (SQLException e){}
    }
%>
    </body>
</html>

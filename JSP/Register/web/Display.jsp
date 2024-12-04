<%-- 
    Document   : Display
    Created on : Sep 6, 2024, 9:58:57 AM
    Author     : Administrator
--%>



<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<%
            ResultSet rs;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/day1","root","");
            PreparedStatement ps=con.prepareStatement("select* from user");
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                
            }
%>

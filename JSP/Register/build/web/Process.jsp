<%-- 
    Document   : Process
    Created on : Sep 5, 2024, 9:41:00 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="bean.RegisterDao"%>
<jsp:useBean id="obj" class="bean.User"/>
<jsp:setProperty property="*" name="obj"/>

<%
    int status=RegisterDao.register(obj);
    if(status>0)
    {
        out.print("You are successfully Registered");
    }
    else
    {    
        out.print("It's not Registered");
    }
%>




<%-- 
    Document   : LoginProcess
    Created on : Sep 2, 2024, 9:46:43 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="bean.LoginDao"%>
<!DOCTYPE html>
<jsp:useBean id="obj" class="bean.Login"/>
<jsp:setProperty property="*" name="obj"/>

<%
  boolean status=LoginDao.validate(obj);
  if(status)
          {
              out.println("You r Successfully logged in");
              session.setAttribute("session","TRUE");
          }
  else
  {
      out.println("Sorry! Email or Pass is Wrong");
  }
  %>

  <jsp:include page="index.jsp"></jsp:include>

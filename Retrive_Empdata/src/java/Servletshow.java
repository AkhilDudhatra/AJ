/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class Servletshow extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servletshow</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servletshow at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/day1";
            String user = "root";
            String pass = "";
            Connection cn = DriverManager.getConnection(url,user,pass);
            String sql="select * from emp1";
            
            
            PreparedStatement ps= cn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            PrintWriter out=response.getWriter();
            
            out.println("<html><head><title>Employee Data</title></head><body align='center'>");
out.println("<h2>Employee Data</h2>");
out.println("<table border='1' align='center' style='width: 80%; font-size: 16px;'>");
out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Phone No</th><th>City</th></tr>");

while(rs.next())
{
    out.println("<tr>");
    out.println("<td>" + rs.getInt("id") + "</td>");
    out.println("<td>" + rs.getString("name") + "</td>");
    out.println("<td>" + rs.getString("email") + "</td>");
    out.println("<td>" + rs.getString("phone_no") + "</td>");
     out.println("<td>" + rs.getString("city") + "</td>");
     
    out.println("</tr>");
} 
out.println("</table>");
out.println("</body></html>");

            out.close();
            rs.close();
            
                    
        }catch(Exception e){
            //PrintWriter out=response.getWriter();
            System.out.println(e);
            //out.print(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

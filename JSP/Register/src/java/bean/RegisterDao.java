/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class RegisterDao {
    
    public static int register(User u)
    {
        int status=0;
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/day1","root","");
            PreparedStatement ps=con.prepareStatement("insert into user (name,email,password) values(?,?,?)");
            
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            
            status = ps.executeUpdate();
            
        }
        catch(Exception e)
        {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        }
        return status;
    }
    
}

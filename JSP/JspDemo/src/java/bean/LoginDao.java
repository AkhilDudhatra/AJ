/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Administrator
 */
public class LoginDao {
    public static boolean validate(Login bean)
    {
        boolean status = false;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/day1","root","");
            PreparedStatement ps=con.prepareStatement("select * from login where Email=? and Pass=?");
            
            ps.setString(1, bean.getEmail());
            ps.setString(2, bean.getPass());
            status = true;
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    return status;
    }
    
}

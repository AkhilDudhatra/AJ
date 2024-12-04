/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class userdao {
    public static Connection getConnection()
    {
        
        Connection con=null;
        
        try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day1","root","");
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    
    public static int save(Stud u) 
    {
        int status=0;
        try{
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("insert into stud(name,email,password,gender,country) values(?,?,?,?,?)");
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            
            ps.setString(4, u.getGender());
            ps.setString(5, u.getCountry());
            status=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
   public static int delete(Stud u)
    {
        int status=0;
        try
        {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("delete from stud where id=?");
            ps.setInt(1,u.getId());
            status=ps.executeUpdate();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
        
    }
    public static List<Stud> getAllRecords()
    {
        List<Stud> list=new ArrayList<Stud>();
        try
        {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("select * from stud");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Stud u=new Stud();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setPassword(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setGender(rs.getString("gender"));
                u.setCountry(rs.getString("country"));
                list.add(u);
            }      
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list;   
    }
    public static Stud getRecordById(int id)
    {
        Stud u = null;
        try{
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("select * from stud where id=?");
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                u=new Stud();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setPassword(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setGender(rs.getString("gender"));
                u.setCountry(rs.getString("country"));
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return u;  
    }
    public static int update(Stud u)
    {
        int status=0;
        try{
            Connection con=getConnection();
            
            PreparedStatement ps=con.prepareStatement("update stud set name=?,password=?,email=?,gender=?,country=? where id=?");
            ps.setString(1,u.getName());
            ps.setString(2,u.getPassword());
            ps.setString(3,u.getEmail());
            ps.setString(4,u.getGender());
            ps.setString(5,u.getCountry());
            ps.setInt(6,u.getId());
            //System.out.println();
            status=ps.executeUpdate();    
        }
        catch(Exception e)
        {
            System.out.println("not found"+e);
        }
        return status;
    }
}

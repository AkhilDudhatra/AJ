/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.*;
import java.sql.*;

public class EmpDao {
    public static Connection getConnection()
    {
        Connection con=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/day1";
            String user = "root";
            String pass = "";
            
            con = DriverManager.getConnection(url,user,pass);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    public static List<Emp> getAllEmployee()
    {
        List<Emp> list =new ArrayList<Emp>();
        
        try{
            Connection con= EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select *from emp1");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                Emp e=new Emp();
                 e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setEmail(rs.getString(3));
                e.setPhone(rs.getString(4));
                e.setCity(rs.getString(5));
                list.add(e);
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public static int Save(Emp e)
    {
        int status=0;
        try{
            Connection con=EmpDao.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into emp1(name,email,phone_no,city) values(?,?,?,?)");
            ps.setString(1,e.getName());
            ps.setString(2,e.getEmail());
            ps.setString(3,e.getPhone());
            ps.setString(4,e.getCity());
            
            status=ps.executeUpdate();
            con.close();
        }
        catch(Exception x)
        {
            x.printStackTrace();
        }
        return status;
    }
    public static int Delete(int id)
    {
        int status = 0;
        try{
            Connection con=EmpDao.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from emp1 where id=?");
            ps.setInt(1, id);
            status=ps.executeUpdate();
            
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
    public static int Edit(Emp e)
    {
        int status = 0;
        try{
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("update emp1 set name=?, email=?, phone_no=?, city=? where id=? ");
            
            ps.setString(1,e.getName());
            ps.setString(2,e.getEmail());
            ps.setString(3,e.getPhone());
            ps.setString(4,e.getCity());
            ps.setInt(5,e.getId());
            
            status =ps.executeUpdate();
            con.close();
            
            
        }catch(Exception x)
        {
            x.printStackTrace();
        }
        return status;
    }
    
    public static Emp getEmployeeById(int id)
    {
        Emp e = new Emp();
        
        try
        {
        Connection con = EmpDao.getConnection();
        PreparedStatement ps = con.prepareStatement("select * from emp1 where id=?");
        
        ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next())
        {
             e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setEmail(rs.getString(3));
                e.setPhone(rs.getString(4));
                e.setCity(rs.getString(5));
            
        }
        con.close();
        }
          catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return e;
    }
}
    


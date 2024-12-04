
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class LoginDao {

    static boolean validate(String n, String p) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    boolean status=false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc.mysql://localhost:3306/demo";
            String user = "root";
            String pass = " ";
            Connection cn = DriverManager.getConnection(url,user,pass);
            String sql="select *from stud where username=? password=?";
            
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1, n);
            ps.setString(2, p);
            
            ResultSet rs=ps.executeQuery();
            status=rs.next();
                    
        }catch(Exception e){
            System.out.println(e);
           
        }
         return status;                                   
    }
    
}

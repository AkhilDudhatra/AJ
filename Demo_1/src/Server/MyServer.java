package Server;
import java.sql.*;

public class MyServer {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
            //here db name,root is username and pass
            
            Statement stmt=con.createStatement();
            
            String qry = "INSERT INTO stud(id,name,study,city) VALUES(5,'hemlata','BTECH','Ahm')"; //insert
            if(stmt.executeUpdate(qry)==1)
            {    
                System.out.println("Inserted...");
            }
            else
            {
                System.out.println("Not INSERTED......");
            }

//            String qry1 = "UPDATE stud SET NAME='Dimpal' WHERE id=5"; //update
//            stmt.executeUpdate(qry1);
//            System.out.println("UPDATED......");
//       
//            String qry3 = "DELETE from stud WHERE id=5"; //delete
//            stmt.executeUpdate(qry3);
//            System.out.println("DELETED......");
//            
            
               
            ResultSet rs=stmt.executeQuery("select * from stud");
            
            while(rs.next())
            {
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Study: "+rs.getString(3));
                System.out.println("City: "+rs.getString(4));
            }
            con.close();
            
        }catch (Exception e)
        {
            System.out.println(e);
            
        }
    }
}

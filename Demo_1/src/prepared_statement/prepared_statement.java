package prepared_statement;
import java.sql.*;
import java.util.*;


public class prepared_statement { 
    
//    int id;
//    String study;
//    String name;
//    String city;
//    Scanner s=new Scanner(System.in);
//    Scanner sc=new Scanner(System.in);
//    
    
//    void insert()
//    {
//        String qry = "insert into stud(id,name,study,city) values(?,?,?,?)";
//    }
//    
    
    public static void main(String[] args) {
        
        int id;
        String study;
        String name;
        String city;
        Scanner s=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
                                    
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
            //here so on is database name, root is username and password
            
                
//            String qry = "select * from stud where id= ?";   //search
//            PreparedStatement pst=con.prepareStatement(qry);
//            System.out.println("Enter Id: ");
//            id=s.nextInt();
//            pst.setInt(1,id); //set input parameter        
//              ResultSet rs = pst.executeQuery();
//            while(rs.next())
//            {
//                System.out.println("ID: "+rs.getInt(1));
//                System.out.println("Name: "+rs.getString(2));
//                System.out.println("City: "+rs.getString(3));
//                System.out.println("Study: "+rs.getString(4));
//            }


//            String qry = "insert into stud(id,name,city,study) values(?,?,?,?)"; //insert
//            PreparedStatement pst=con.prepareStatement(qry);
//            System.out.println("\nEnter Id: ");
//            id=s.nextInt();
//            pst.setInt(1,id);
//            System.out.println("\nEnter Name: ");
//            name=sc.nextLine();
//            pst.setString(2,name);
//            System.out.println("\nEnter Study: ");
//            study=sc.nextLine();
//            pst.setString(3,study);
//            System.out.println("\nEnter City: ");
//            city=sc.nextLine();
//            pst.setString(4,city);
//            int i=pst.executeUpdate();
//            System.out.println("\nInsert Successfully: ");
//            

           String qry= "UPDATE stud SET name=? WHERE id=? ";
           PreparedStatement pst=con.prepareStatement(qry);
           
           System.out.println("\nEnter Id: ");
           id=s.nextInt();
           pst.setInt(2,id);
           System.out.println("\nEnter New Name: ");
           name=sc.nextLine();
           pst.setString(1,name);
           pst.executeUpdate();
           System.out.println("\nUpdate Successfully: ");
           
           
           




           con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}

package tcpclient_5;
import java.io.*;
import java.util.*;
import java.net.*;

public class TcpClient_5 {

    
    public static void main(String[] args) throws IOException 
    {
        // TODO code application logic here
        Socket s = new Socket("localhost",6666);
        System.out.println("Enter the array size: ");
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements: ");
        
        DataOutputStream dout= new DataOutputStream(s.getOutputStream());
        dout.writeInt(n);
        
        for(int i=0;i<n;i++)
        {
            int r=sc.nextInt();
            dout.writeInt(r);
        }
        DataInputStream din= new DataInputStream(s.getInputStream());
        
        int r;
    
        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
        {
            r=din.readInt();
            System.out.println(r+" ");
            
        }
        s.close();
    }
    
}

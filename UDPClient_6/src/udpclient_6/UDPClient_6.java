package udpclient_6;
import java.util.*;
import java.io.*;
import java.net.*;

public class UDPClient_6 {


    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        DatagramSocket ds = new DatagramSocket();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the size of Array: ");
        int size= sc.nextInt();
        
        System.out.println("Enter the input array: ");
        StringBuilder ar= new StringBuilder();
        for(int i=0;i<size;i++)
        {
            ar.append(sc.nextInt());
            ar.append(" ");
            
        }
        sc.close();
        String str = ar.toString();
        InetAddress ip= InetAddress.getByName("127.0.0.1");
        DatagramPacket dp= new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        DatagramPacket sorted= new DatagramPacket(new byte[1024],1024);
        ds.receive(sorted);
        String res = new  String(sorted.getData());
        System.out.println("Received Data: ");
        System.out.println(res);
        ds.close();
        
    }
    
}
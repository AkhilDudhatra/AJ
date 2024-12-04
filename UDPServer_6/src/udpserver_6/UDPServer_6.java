package udpserver_6;
import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class UDPServer_6 {

    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        DatagramSocket ds=new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);
                   
        String str= new  String(dp.getData(), 0 ,dp.getLength());
        String[] strs = str.split(" ");
        
        List<Integer> list = new ArrayList<>();
        
        for(String s: strs){
            try
            {
                list.add(Integer.parseInt(s));
            }catch(Exception e)
            {   
            }
        }
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        
        for(int a: list)
        {
            sb.append(a);
            sb.append(" ");
        }
        String s=sb.toString();
        DatagramPacket sorted = new DatagramPacket(s.getBytes(),s.length(), dp.getAddress(),dp.getPort());
        ds.send(sorted);
        System.out.println("Data Received : ");
        System.out.println(str);
        ds.close();
    }
}
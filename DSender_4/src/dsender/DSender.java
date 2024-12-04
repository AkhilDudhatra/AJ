package dsender;
import java.net.*;


public class DSender {

    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        DatagramSocket ds=new DatagramSocket();
        String str= "Welcome java";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new  DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        ds.close();
    }
    
}

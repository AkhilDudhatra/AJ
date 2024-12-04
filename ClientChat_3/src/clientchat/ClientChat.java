package clientchat;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientChat {

    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //create a connection to the server socket on the server
            
            InetAddress host = InetAddress.getLocalHost();
            Socket socket = new Socket (host.getHostName(), 5600);
            
            //sent a message to the the client application
            
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis=new DataInputStream(System.in);
            
            String line = "";
            while(!line.equals("Bye"))
            {
                try{
                    line = dis.readLine();
                    dos.writeUTF(line);
                    dos.flush();
                }catch(Exception e)
                {
                    System.out.println("Sending error: "+e.getMessage());
                }
            }
            dis.close();
            dos.close();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

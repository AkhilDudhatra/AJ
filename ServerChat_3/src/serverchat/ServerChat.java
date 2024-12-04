package serverchat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerChat {
    
    private ServerSocket server;
    private int port = 5600;
    
    public ServerChat(){
        try{
            server = new ServerSocket(port);
            
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        ServerChat server = new ServerChat();
        server.connection();
    }
    
    public void connection()
    {
        System.out.println("Waiting for Client.........");
        try{
            Socket socket = server.accept();
            System.out.println("Client Accepted: ");
            
            DataInputStream d=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
           // DataOutputStream dd =new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            boolean done = false;
            while(!done)
            {
               //String line = "";
           
                try{
                 //   line = d.readLine();
                   String line = d.readUTF();
                   System.out.println(line);
                   done = line.equals("Bye");
                   //dd.writeUTF(line);
                   // dd.flush();
                   
               }catch(IOException ioe)
               {
                   done = true;
               }
            } 
            
            d.close();
            socket.close();
            
        }catch(Exception ioe)
        {
            System.out.println(ioe);
        }   
    }
}
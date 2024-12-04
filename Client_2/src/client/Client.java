/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
/**
 *
 * @author Administrator
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Socket s=new Socket("localhost",6666);
            
            DataOutputStream d=new DataOutputStream(s.getOutputStream());
            
            d.writeUTF("Hello Word!");
            d.flush();
            d.close();
            s.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Error "+e);
        }
    }
    
}

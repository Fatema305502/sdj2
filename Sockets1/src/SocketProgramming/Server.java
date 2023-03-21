package SocketProgramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//  Java socket programming where client sends a text and server receives and prints it.
public class Server
{
  public static void main(String[] args) throws IOException
  {
    try
    {
      ServerSocket ss=new ServerSocket(6666);
      Socket s=ss.accept(); //establishes connection and waits for the client
      DataInputStream dis= new DataInputStream(s.getInputStream());
      String str =(String)dis.readUTF();
      System.out.println("message =" +str);
      ss.close();

    }catch (Exception e){
      System.out.println(e);
    }



  }
}

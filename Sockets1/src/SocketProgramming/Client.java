package SocketProgramming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client
{
  public static void main(String[] args) throws IOException
  {
    try
    {
      //IP address and port number
      Socket s=new Socket("localhost",6666);
      DataOutputStream dout=new DataOutputStream(s.getOutputStream());
      dout.writeUTF("Hello Server");
      dout.flush();
      dout.close();
      s.close();

    }catch ( Exception e){
      System.out.println(e);
    }


  }


}

package MultipleClientConnects.SimpleClient2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain2
{
  public static void main(String[] args) throws IOException
  {
    Socket socket=new Socket("127.0.0.1",1235);
    PrintWriter out= new PrintWriter(socket.getOutputStream());
    BufferedReader in = new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
    Scanner sc =new Scanner(System.in);



    String message = in.readLine();
    System.out.println(message);
    String name = new Scanner(System.in).nextLine();
    out.println(name);
    message = in.readLine();
    System.out.println(message);





  }

  }



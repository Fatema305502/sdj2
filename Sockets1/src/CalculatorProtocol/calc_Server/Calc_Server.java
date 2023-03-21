package CalculatorProtocol.calc_Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Calc_Server
{
  public static void main(String[] args) throws IOException
  {

    //Step 1:establish the socket connection
    ServerSocket ss=new ServerSocket(4444);
    Socket s= ss.accept();

    System.out.println("Client connected from " + s.getInetAddress().getHostAddress() + " " + s.getLocalPort());
    //step2: processing the request
    DataInputStream dis= new DataInputStream(s.getInputStream());
    DataOutputStream dos= new DataOutputStream(s.getOutputStream());


    while (true){

      //wait for input
      String input =dis.readUTF();

      if (input.equals("bye"))
        break;

      System.out.println("Equation received :-" + input);


      int result;


      // Use StringTokenizer to break the equation into operand and operation
      /* The string tokenizer class allows an application to break a string into tokens.
       The tokenization method is much simpler than the one used by the StreamTokenizer class.
       The StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments.*/
      StringTokenizer st= new StringTokenizer(input);


      int oprnd1=Integer.parseInt(st.nextToken());
      String operation =st.nextToken();

      int oprnd2= Integer.parseInt(st.nextToken());


      // perform the required operation.
      if (operation.equals("+"))
      {
        result = oprnd1 + oprnd2;
      }

      else if (operation.equals("-"))
      {
        result = oprnd1 - oprnd2;
      }
      else if (operation.equals("*"))
      {
        result = oprnd1 * oprnd2;
      }
      else
      {
        result = oprnd1 / oprnd2;
      }
      System.out.println("Sending the result...");

      // send the result back to the client.
      dos.writeUTF(Integer.toString(result));
    }
  }

}


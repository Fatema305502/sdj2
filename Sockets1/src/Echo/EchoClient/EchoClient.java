package Echo.EchoClient;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class EchoClient
{
  public static void main(String[] args)
  {
    try
    {

      Socket socket = new Socket("localhost", 2910);
//used to send objects to the server
      ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
      outToServer.writeObject("test");
// used to read objects from server
      ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());

      //receive response from server
      String o = (String) inFromServer.readObject();

      System.out.println("Received from server: " + o);

    }
    catch (Exception e)
    {

    }
  }
}

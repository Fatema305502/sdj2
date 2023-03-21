package Client;

import java.net.Socket;
import java.util.Scanner;

public class Client
{
  public static void main(String[] args)
  {
    try
    {
      Socket socket = new Socket("localhost", 2910);
      ClientConnection clientConnection = new ClientConnection(socket);
      new Thread(clientConnection).start();

      while(true) {
        Scanner keyboard = new Scanner(System.in);
        String stringToSend = keyboard.nextLine();
        clientConnection.sendMessage(stringToSend);
      }
    }
    catch (Exception e)
    {

    }
  }
}

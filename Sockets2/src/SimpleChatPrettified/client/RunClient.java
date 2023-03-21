package SimpleChatPrettified.client;

import java.util.Scanner;

public class RunClient
{
  public static void main(String[] args)
  {
    SocketClient socketClient = new SocketClient();

    //Necessary to accept user input. Should be removed when migrating to GUI
    Scanner keyboard = new Scanner(System.in);
    while (true)
    {
      String message = keyboard.nextLine();
      socketClient.sendMessage(message);
    }
  }
}

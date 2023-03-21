package SimpleChatPrettified.client;

import java.net.Socket;

public class SocketClient
{
  private ClientSocketHandler clientConnection;

  public SocketClient()
  {
    try
    {
      Socket socket = new Socket("localhost", 2910);


      clientConnection = new ClientSocketHandler(socket);
      new Thread(clientConnection).start();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  public void sendMessage(String message)
  {
    clientConnection.sendMessage(message);
  }
}

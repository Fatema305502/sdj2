package simplechat.server.networking;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer
{

  private Pool connectedClients = new Pool();

  public void startServer()
  {
    System.out.println("Starting server...");
    try
    {
      ServerSocket welcomeSocket = new ServerSocket(2910);

      while(true)
      {
        Socket socket = welcomeSocket.accept();
        System.out.println("Client connected");

        ServerSocketHandler client = new ServerSocketHandler(socket, connectedClients);
        connectedClients.addConn(client);
        new Thread(client).start();

      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}

package Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server
{
  private static ArrayList<ServerConnection> connectedClients;

  public static void main(String[] args)
  {
    System.out.println("Starting server...");
    connectedClients = new ArrayList<ServerConnection>();

    try
    {
      ServerSocket welcomeSocket = new ServerSocket(2910);

      while(true)
      {
        System.out.println("Waiting for client...");

        Socket socket = welcomeSocket.accept();
        ServerConnection serverConnection = new ServerConnection(socket, connectedClients);
        connectedClients.add(serverConnection);
        System.out.println("Client connected");

        new Thread(serverConnection).start();
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.out.println("server crashed");
    }
  }

}

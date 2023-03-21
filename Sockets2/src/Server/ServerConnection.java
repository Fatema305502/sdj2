package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerConnection implements Runnable
{
  private Socket clientSocket;

  private ObjectInputStream inFromClient;
  private ObjectOutputStream outToClient;
  private ArrayList<ServerConnection> connectedClients;

  public ServerConnection(Socket clientSocket, ArrayList<ServerConnection> connectedClients)
  {
    this.clientSocket = clientSocket;
    this.connectedClients = connectedClients;
    try
    {
      outToClient = new ObjectOutputStream(clientSocket.getOutputStream());
      inFromClient = new ObjectInputStream(clientSocket.getInputStream());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  @Override
  public void run()
  {

    try
    {
      while (true)
      {
        //Read message from client
        String message = (String) inFromClient.readObject();
        System.out.println("Message from client: " + message);
        sendMessage(message);
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }

  }

  private void sendMessage(String message)
  {
    System.out.println("number of clients: " + connectedClients.size());
    for (ServerConnection client : connectedClients)
    {
      try {
        client.outToClient.writeObject(message);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

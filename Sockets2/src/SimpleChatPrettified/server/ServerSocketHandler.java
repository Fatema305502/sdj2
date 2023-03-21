package SimpleChatPrettified.server;

import SimpleChatPrettified.transferobjects.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable
{

  private ObjectInputStream inFromClient;
  private ObjectOutputStream outToClient;
  private Pool connectedClients;

  public ServerSocketHandler(Socket clientSocket, Pool connectedClients)
  {
    this.connectedClients = connectedClients;
    try
    {
      inFromClient = new ObjectInputStream(clientSocket.getInputStream());
      outToClient = new ObjectOutputStream(clientSocket.getOutputStream());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void run()
  {
    try
    {
      while (true)
      {
        Message message = (Message) inFromClient.readObject();
        System.out.println("Received from client: " + message.getMessage());
        connectedClients.broadcast(message.getMessage());

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

  public void sendMessage(java.lang.String msg)
  {
    try
    {
      outToClient.writeObject(new Message(msg));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}

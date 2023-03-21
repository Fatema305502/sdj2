package SimpleChatPrettified.client;

import SimpleChatPrettified.transferobjects.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSocketHandler implements Runnable
{

  private ObjectOutputStream outToServer;
  private ObjectInputStream inFromServer;

  public ClientSocketHandler(Socket serverSocket) {
    try {
      outToServer = new ObjectOutputStream(serverSocket.getOutputStream());
      inFromServer = new ObjectInputStream(serverSocket.getInputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override public void run()
  {
    try
    {
      while (true)
      {
        Message message = (Message) inFromServer.readObject();
        System.out.println("Received from server: " + message.getMessage());
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

  public void sendMessage(String message)
  {
    try
    {
      outToServer.writeObject(new Message(message));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}

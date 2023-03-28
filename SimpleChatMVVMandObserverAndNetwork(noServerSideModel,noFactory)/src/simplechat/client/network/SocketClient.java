package simplechat.client.network;

import simplechat.shared.transferobjects.Message;
import simplechat.shared.util.Subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketClient implements Runnable, Subject
{
  private ObjectOutputStream outToServer;
  private ObjectInputStream inFromServer;
  private PropertyChangeSupport support;

  public SocketClient()
  {
    support = new PropertyChangeSupport(this);
    try
    {
      Socket socket = new Socket("localhost", 2910);
      outToServer = new ObjectOutputStream(socket.getOutputStream());
      inFromServer = new ObjectInputStream(socket.getInputStream());
      new Thread(this).start();
    }
    catch (Exception e)
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
        Message message = (Message) inFromServer.readObject();
        System.out.println("Received from server: " + message.getMessage());
        support.firePropertyChange("MessageReceived", null, message);
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

  @Override
  public void addListener(String eventName, PropertyChangeListener listener) {
    support.addPropertyChangeListener(eventName, listener);
  }

  @Override
  public void removeListener(String eventName, PropertyChangeListener listener) {
    support.removePropertyChangeListener(eventName, listener);
  }
}

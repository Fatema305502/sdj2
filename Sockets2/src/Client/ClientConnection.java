package Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientConnection implements Runnable
{

  private Socket serverSocket;
  private ObjectOutputStream outToServer;
  private ObjectInputStream inFromServer;

  public ClientConnection(Socket serverSocket) {
    this.serverSocket = serverSocket;
    try {
      outToServer = new ObjectOutputStream(serverSocket.getOutputStream())
      inFromServer = new ObjectInputStream(serverSocket.getInputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    try {
      while(true) {
        String o = (String) inFromServer.readObject();
        System.out.println("Received from server: " + o);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void sendMessage(String message)
  {
    try {
      outToServer.writeObject(message);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

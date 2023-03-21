package ClientServer.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
// to listen to the response from the server without getting blocked while reading from a Scanner. We have used input BufferReader to get information from the client.
public class ClientThread extends Thread implements Runnable
{
  private Socket socket;
  private BufferedReader input;


  public ClientThread(Socket s) throws IOException
  {
    this.socket= s;
    this.input= new BufferedReader(new InputStreamReader(socket.getInputStream()));

  }
  @Override
  public void run(){
    try
    {
      while (true){
        String response =input.readLine();
        System.out.println(response);

      }
    }catch (IOException e){
      e.printStackTrace();
    }

  }
}

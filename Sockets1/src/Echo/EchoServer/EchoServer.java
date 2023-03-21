package Echo.EchoServer;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class EchoServer
{

  public static void main(String[] args)
  {
    System.out.println("Starting server......");
    try{

      //creating a server socket
      ServerSocket welcomeSocket= new ServerSocket(2910);
      while (true){


//create a new socket to handle the client
        Socket socket= welcomeSocket.accept(); //server socket accepts a connection .this will wait until a connection is made
        System.out.println("Client Connected");
//create objectinputstream to receive objects sent from the client
        ObjectInputStream inFromClient = new ObjectInputStream(socket.getInputStream());
//receive object form client
        //læse en object og caste det til string
        String o = (String)inFromClient.readObject();
        System.out.println("Received from client : " + o);
//create server response. logic på server
        String answer= o.toUpperCase();
//we use this to send objects to the client
        ObjectOutputStream outputClient =new ObjectOutputStream(socket.getOutputStream());
        //send response object to client
        outputClient.writeObject(answer);


      }
    } catch (Exception e){

    }
  }
}

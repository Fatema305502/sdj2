package ClientServer.Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain
{
  public static void main(String[] args) {

    //using serversocket as argument to automatically close the socket

    //the port number us unique for each server

    //list to add all the clients thread
    ArrayList<ServerThread> threadList= new ArrayList<>();
    try(ServerSocket serverSocket= new ServerSocket(5000)){
      while (true){
        Socket socket=serverSocket.accept();
        ServerThread serverThread=new ServerThread(socket, threadList);
        //starting the thread
        threadList.add(serverThread);
        serverThread.start();
            //get all the list of currently running thread
      }
    }catch (Exception e){
      System.out.println("Error occured in main : " + e.getStackTrace());
    }
  }
}

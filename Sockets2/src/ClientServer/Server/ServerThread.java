package ClientServer.Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread
{
  private Socket socket;
  private ArrayList<ServerThread> threadList;
  private PrintWriter output;



  public ServerThread (Socket socket, ArrayList<ServerThread > threads){

    this.socket=socket;
    this.threadList=threads;


  }
  @Override
  public void run(){
    try{

      //reading the input from client
      //The BuffereReader helps us to receive information from the client.
      BufferedReader input= new BufferedReader(new InputStreamReader(socket.getInputStream()));


      //returning the output to the client : true statement is to flush the buffer otherwise
      //we have to do it manually

      output = new PrintWriter(socket.getOutputStream());

//infinite loop for server
      while (true){
        String outputString = input.readLine();

        if (outputString.equals("exit")){
          break;
        }
        printToAllClient(outputString);

        System.out.println("Server Received  " + outputString);
      }
    }catch (Exception e){
      System.out.println("Error occured " +e.getStackTrace());
    }
  }
  // the methode sends the output to each client in the thread
  private void printToAllClient(String outputString){
  for (ServerThread sT:threadList){
    sT.output.println(outputString);
  }
  }
}
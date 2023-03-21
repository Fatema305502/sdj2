package ClientServer.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain
{
  public static void main(String[] args)
  {
    try (Socket socket = new Socket("localhost", 5000))
    {
      //reading the input form server
      BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//taking the user input
      // We use the Scanner to get the input from the user and send the data to the server using the PrintWriter object.
      Scanner scanner = new Scanner(System.in);
      String userInput;
      String response;
      String clientName = "empty";
      ClientThread clientThread = new ClientThread(socket);

      clientThread.start();
// loop closes when user enters exit command
      do
      {
        if (clientName.equals("empty"))
        {
          System.out.println("Enter your name ");
          userInput = scanner.nextLine();
          clientName = userInput;
          output.println(userInput);
          if (userInput.equals("exit"))
          {
            break;
          }
        }
        else
        {
          String message = ("(" + clientName + ")" + "message : ");
          System.out.println(message);
          userInput = scanner.nextLine();
          output.println(message + "" + userInput);
          if (userInput.equals("exit"))
          {
            break;
          }
        }
      }
      while (!userInput.equals("exit"));

    }
    catch (Exception e)
    {
      System.out.println("Exception occured in client main :" + e.getStackTrace());
    }
  }
}

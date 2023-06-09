package returnexample.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient1
{
  public static void main(String[] args)
      throws RemoteException, NotBoundException, NotBoundException,
      RemoteException
  {
    RMIClient1 client = new RMIClient1();
    client.startClient();

    Scanner in = new Scanner(System.in);
    while(true) {
      System.out.println("Input >");
      String line = in.nextLine();

      if(line.equalsIgnoreCase("exit")) break;

      String result = null;
      try {
        result = client.toUpperCase(line);
        System.out.println("Result > " + result);
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
  }
}

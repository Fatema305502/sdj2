package callbackexample.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient
{
  public static void main(String[] args) throws RemoteException,
      NotBoundException
  {

    RMIClient client = new RMIClient();

    Scanner input = new Scanner(System.in);
    System.out.println("Please input string to convert: " );
    String stringToConvert = input.nextLine();
    client.toUpperCase(stringToConvert);
    System.out.println("done");

  }
}

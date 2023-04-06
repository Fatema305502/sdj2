package returnexample.client;

import returnexample.shared.UpperCaseServer1;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient1
{
  private UpperCaseServer1 server;

  public RMIClient1() {}

  public void startClient() throws RemoteException, NotBoundException
  {
    Registry registry = LocateRegistry.getRegistry("localhost", 1099);
    server = (UpperCaseServer1)registry.lookup("Server");
  }

  public String toUpperCase(String argument) {
    String result = null;
    result = server.toUpperCase(argument);
    return result;
  }
}

package returnexample.server;

import returnexample.shared.UpperCaseServer1;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunServer1
{
  public static void main(String[] args)
      throws RuntimeException, AlreadyBoundException, RemoteException
  {
    UpperCaseServer1 server = new ServerImpl1();
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.bind("Server", server);
    System.out.println("Server started");
  }
}

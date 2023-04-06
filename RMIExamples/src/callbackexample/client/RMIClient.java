package callbackexample.client;

import callbackexample.shared.UpperCaseClient;
import callbackexample.shared.UpperCaseServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIClient implements UpperCaseClient
{
  private UpperCaseServer server;

  public RMIClient() throws RemoteException, NotBoundException
  {
    UnicastRemoteObject.exportObject(this, 0);
    Registry registry = LocateRegistry.getRegistry("localhost" , 1099);
    server = (UpperCaseServer) registry.lookup("UpperCaseServerWithCallBack");
  }

  public void toUpperCase(String str) throws RemoteException
  {
    server.toUpperCase(str, this);
  }



  @Override public void uppercaseResult(String result) throws RemoteException
  {
    System.out.println();
  }
}

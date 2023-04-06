package upperCaseBroadcastExample.client;

import upperCaseBroadcastExample.shared.UpperCaseClient;
import upperCaseBroadcastExample.shared.UpperCaseServer;

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
    server = (UpperCaseServer) registry.lookup("UpperCaseServerWithBroadcast");
    server.registerClient(this);
  }

  public void toUpperCase(String str) throws RemoteException
  {
    server.toUpperCase(str, this);
  }

  @Override public void update(String str) throws RemoteException
  {
    System.out.println(str);
  }
}

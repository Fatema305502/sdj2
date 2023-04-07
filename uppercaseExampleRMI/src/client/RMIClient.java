package client;

import server.RMIServerlmpl;

import javax.management.remote.rmi.RMIServerImpl;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient
{
  private final RMIServerlmpl server;

  public RMIClient() throws RemoteException, NotBoundException
  {
    Registry registry = LocateRegistry.getRegistry("localhost" , 1099);
    server = (RMIServerlmpl) registry.lookup("UpperCaseServer");
  }

  public String toUpperCase(String str) throws RemoteException
  {
    return server.toUpperCase(str);
  }

}

package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunServer
{
  public static void main(String[] args) throws RemoteException,
      AlreadyBoundException
  {
    RMIServerlmpl server=new RMIServerlmpl();
    Registry registry= LocateRegistry.createRegistry(1099);
    registry.bind("UpperCaseServer",server);

  }
}

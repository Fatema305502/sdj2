package returnexample.server;

import returnexample.shared.UpperCaseServer1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl1 implements UpperCaseServer1
{
  public ServerImpl1() throws RemoteException, RemoteException
  {
    UnicastRemoteObject.exportObject(this, 0);
  }

  @Override
  public String toUpperCase(String str) {
    return str.toUpperCase();
  }
}

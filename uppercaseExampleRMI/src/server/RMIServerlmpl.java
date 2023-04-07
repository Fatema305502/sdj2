package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class RMIServerlmpl implements Remote
{
  public RMIServerlmpl() throws RemoteException
  {
    UnicastRemoteObject.exportObject(this,0);
  }
  public String toUpperCase(String str) throws RemoteException{
    return str.toUpperCase();
  }
}

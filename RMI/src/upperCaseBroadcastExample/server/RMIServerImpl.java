package upperCaseBroadcastExample.server;

import upperCaseBroadcastExample.shared.UpperCaseClient;
import upperCaseBroadcastExample.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class RMIServerImpl implements UpperCaseServer
{

  private List<UpperCaseClient> clientList;

  public RMIServerImpl() throws RemoteException
  {
    UnicastRemoteObject.exportObject(this, 0);
    clientList = new ArrayList<UpperCaseClient>();
  }

  public void toUpperCase(String str, UpperCaseClient client) throws RemoteException
  {
    String result = str.toUpperCase();

    updateAllClients(result);
  }

  private void updateAllClients(String result) throws RemoteException
  {
    for (UpperCaseClient upperCaseClient : clientList)
    {
      upperCaseClient.update(result);
    }
  }

  @Override public void registerClient(UpperCaseClient client) throws RemoteException
  {
    clientList.add(client);
    System.out.println("number of clients: " + clientList.size());
  }
}

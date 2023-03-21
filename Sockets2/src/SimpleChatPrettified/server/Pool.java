package SimpleChatPrettified.server;

import java.util.ArrayList;
import java.util.List;

public class Pool
{

  private List<ServerSocketHandler> connections;

  public Pool()
  {
    connections = new ArrayList<>();
  }

  public void addConn(ServerSocketHandler ssh)
  {
    connections.add(ssh);
  }

  public void broadcast(String msg)
  {
    for (ServerSocketHandler client : connections)
    {
      client.sendMessage(msg);
    }
  }
}

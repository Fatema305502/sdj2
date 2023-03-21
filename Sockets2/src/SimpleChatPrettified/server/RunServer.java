package SimpleChatPrettified.server;

import SimpleChatPrettified.client.SocketClient;

public class RunServer
{
  public static void main(String[] args)
  {
    SocketServer server = new SocketServer();
    server.startServer();
  }
}

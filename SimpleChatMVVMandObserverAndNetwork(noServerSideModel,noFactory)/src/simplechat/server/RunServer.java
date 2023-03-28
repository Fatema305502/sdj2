package simplechat.server;

import simplechat.server.networking.SocketServer;

public class RunServer
{

  public static void main(String[] args)
  {
    SocketServer server = new SocketServer();
    server.startServer();
  }

}

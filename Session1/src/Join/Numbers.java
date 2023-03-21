package Join;

public class Numbers implements Runnable
{

  private Thread threadToJoin;
  private int from, to;

  public Numbers( int from, int to)
  {

    this.from = from;
    this.to = to;
  }


  @Override public void run()
  {
    try
    {
      if(threadToJoin != null)
        threadToJoin.join();
    }

    catch (InterruptedException e)
    {
      e.printStackTrace();
    } for (int i = from; i <to ; i++)
  {
    System.out.println(i);
  }

  }
}

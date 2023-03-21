package SleepingBear;

public class PokingMan implements Runnable
{
  private Thread bearThread;
  private int waitTime;

  public PokingMan(Thread bearThread, int waitTime)
  {
    this.bearThread = bearThread;
    this.waitTime=waitTime;
  }

  @Override public void run()
  {
    try{
      Thread.sleep(waitTime);
      bearThread.interrupt();

    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}

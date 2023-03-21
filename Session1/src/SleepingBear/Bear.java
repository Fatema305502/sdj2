package SleepingBear;

public class Bear implements Runnable

{
  @Override public void run()
  {
    try
    {
      Thread.sleep(5000);
      System.out.println("I am well rested");
    }
    catch (InterruptedException e)
    {
      System.out.println("WRAH JEG ER SUR!");
    }
  }
}

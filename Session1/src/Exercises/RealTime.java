package Exercises;

import java.util.Date;

public class RealTime implements Runnable
{
  @Override public void run()
  {
    while (!Thread.currentThread().isInterrupted()){
      System.out.println("Current time: %tr \n " +
          new Date());
      try{
        Thread.sleep(5000);
      }
      catch (Exception e)
      {
        System.out.println(e.getMessage());
      }
    }

    }
}

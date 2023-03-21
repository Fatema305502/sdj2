package Exercises;

public class ExamTimer implements Runnable
{
  @Override public void run()
  {
    try{
      Thread.sleep(20000);
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }
  }

  public void isAlive()
  {

  }
}

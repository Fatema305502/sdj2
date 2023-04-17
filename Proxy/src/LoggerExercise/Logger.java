package LoggerExercise;

public class Logger implements Log
{
  @Override public void log(String message)
  {
    System.out.println(message);
  }

}

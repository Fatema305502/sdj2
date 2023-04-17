package LoggerExercise;

public class Main
{
  public static void main(String[] args)
  {
    LogLevelController controller = new LogLevelController("sparse");
    Log logger = new Logger();
    Log proxy = new ProxyLog(controller, logger);
    proxy.log("This message should not be logged.");
    proxy.log("This error message should be logged.");


  }
}

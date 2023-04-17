package LoggerExercise;



public class ProxyLog implements Log
{
  private LogLevelController controller;
  private Log logger;

  public ProxyLog(LogLevelController controller, Log logger)
  {
    this.controller = controller;
    this.logger = logger;
  }

  @Override public void log(String message)
  {
    if (controller.isVerbose()){
      logger.log(message);
    } else{
      String level1= (String) controller.getLogs();
      if (level1.equals("sparse") && message.toLowerCase().contains("error")){
        logger.log(message);
      }
    }

  }
}

package LoggerExercise;

public class LogLevelController
{

  private final String level;
  private final boolean verbose;

  public LogLevelController(String level) {
    this.level = level;
    this.verbose = level.equals("verbose");
  }
  public String getLevel() {
    return level;
  }

  public boolean isVerbose() {
    return verbose;
  }

  public Object getLogs()
  {
    return level;
  }
}

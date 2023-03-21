package Runnables;

public class Numbers implements Runnable
{
  private int runTo;
//Constructors
  public Numbers(int runTo) {
    this.runTo = runTo;
  }

  public void run() {
    while (true) {
      for (int j = 0; j < runTo; j++) {
        System.out.println("Numbers:" + j);
      }
    }

  }
}


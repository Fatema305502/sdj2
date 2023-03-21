package Runnables;




  public class Chars implements Runnable {

    private int runTo;

// Constructors
    public Chars(int runTo)
    {
      this.runTo = runTo;
    }
    //the Runnable metode
    public void run() {
      while (true) {
        for (int j = 0; j < runTo; j++) {
          System.out.println("Bogstav:" + (char) (j  + 97) + ", " + j);
        }
      }

    }
  }


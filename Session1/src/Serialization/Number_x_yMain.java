package Serialization;

public class Number_x_yMain
{
  public static void main(String[] args) throws InterruptedException
  {
    Thread N1 = new Thread(new Numbers_x_y(0,2500));
    Thread N2 = new Thread(new Numbers_x_y(2500,5000));
    Thread N3 = new Thread(new Numbers_x_y(5000,7500));
    Thread N4 = new Thread(new Numbers_x_y(7500,10000));

    //Two ways to do this
    //The simple solution:
    N1.start();
    N1.join();
    N2.start();
    N2.join();
    N3.start();
    N3.join();
    N4.start();
    N4.join();

    //Or you could place the join inside Numbers_X_Y.
    // It would need a reference to the thread to join.
  }

  }


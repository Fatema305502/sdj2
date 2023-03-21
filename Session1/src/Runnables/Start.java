package Runnables;

public class Start
{
  public static void main(String[] args)
  {
    Thread t1 =new Thread(new Numbers(17));
    Thread t2=new Thread(new Chars(36));
    t1.start();
    t2.start();
  }


}

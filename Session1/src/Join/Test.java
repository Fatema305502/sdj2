package Join;

public class Test

{
  public static void main(String[] args) throws InterruptedException
  {
    Thread t1=new Thread(new Numbers(0, 10));
    Thread t2=new Thread(new Numbers(10, 20));
    Thread t3=new Thread(new Numbers(20, 30));
    Thread t4=new Thread(new Numbers(30, 40));
    Thread t5=new Thread(new Numbers(40, 50));

    t1.start();
    t1.join();
    t2.start();
    t2.join();
    t3.start();
    t3.join();
    t4.start();
    t4.join();



  }

}

package Singleton;

public class SingletonDemo
{
  public static void main(String[] args)
  {
    /*create a singleton object */
    Singleton tmp= Singleton.getInstance();
    tmp.demoMethod();
  }
}

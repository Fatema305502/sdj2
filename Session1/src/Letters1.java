public class Letters1 implements Runnable
{
  @Override public void run()
  {
    while (true){
      for (int i = 0; i <10 ; i++)
      {
        System.out.println((char) (i+97));
      }
    }
  }
}

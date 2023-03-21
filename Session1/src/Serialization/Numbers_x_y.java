package Serialization;

public class Numbers_x_y implements Runnable
{

  private int x,y;
  Thread threadToJoin;

  public Numbers_x_y(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  @Override public void run()
  {
    if (threadToJoin !=null){
      try
      {
        threadToJoin.join();
      }catch (InterruptedException e){
        e.printStackTrace();
      }
      for (int i = x; i <y ; i++){
        System.out.println(i);
      }

    }
  }
}

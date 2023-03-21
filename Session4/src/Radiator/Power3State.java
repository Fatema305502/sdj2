package Radiator;

public class Power3State implements RadiatorState ,Runnable
{
  private int POWER;

  public Power3State(Radiator radiator )
  {
    this.POWER = 3;
    Thread thread=new Thread(() -> {
      try
      {
        this.wait(10);
        radiator.setPowerState( new Power2State());

      }catch (InterruptedException e){

      }finally
      {
        radiator.setPowerState(new Power2State());
      }
    });
    thread.start();
  }

  @Override public void turnUp(Radiator radiator)
  {

  }

  @Override public void turnDown(Radiator radiator)
  {

  }

  @Override public int getPower()
  {
    return 0;
  }

  @Override public void run()
  {

  }
}

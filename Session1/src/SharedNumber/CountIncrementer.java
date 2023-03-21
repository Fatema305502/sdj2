package SharedNumber;

public class CountIncrementer implements Runnable
{
  private Counter counter;

  public CountIncrementer(Counter counter)
  {
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = counter.getCount(); i <1000000 ; i++)
    {

    }

  }
}

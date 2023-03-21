package SharedNumber;

public class Main
{
  private Counter counter;
  public static void main(String[] args)
  {
    Counter counter=new Counter();
    CountIncrementer ci=new CountIncrementer(counter);
  }
}

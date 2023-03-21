package SleepingBear;

public class Start
{
  public static void main(String[] args)
  {
    Bear bear = new Bear();
    Thread bearThread = new Thread(bear);
    PokingMan man = new PokingMan(bearThread, 4990);
    Thread manThread = new Thread(man);
    bearThread.start();
    manThread.start();

  }
}


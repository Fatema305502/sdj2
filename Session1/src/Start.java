public class Start
{
  public static void main(String[] args)
  {
    Thread numPrint=new Thread(new Numbers());
    Thread letPrint=new Thread(new Letters1());

    numPrint.start();
    letPrint.start();

  }
}

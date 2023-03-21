package PhoneWithState;

public class Main
{
  public static void main(String[] args)
  {
    Phone phone=new Phone();
    phone.receiveMessage("HELLO");
    phone.goToSilentState();
    phone.receiveCall();

    phone.receiveCall();
    phone.vibrate();
    phone.turnVolumeDown();
  }
}

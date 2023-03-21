package PhoneWithState;

public record SilentState() implements PhoneState
{
  @Override public void onReceiveMessage(String txt, Phone phone)
  {

    System.out.println(txt);

  }

  @Override public void onReceiveCall(Phone phone)
  {
    phone.lightUpScreen();
  }
//to change the state from silent to vibrate
  @Override public void onVolumeButtonUp(Phone phone)
  {
    phone.setState(new VibrateState());

  }

  @Override public void onVolumeButtonDown(Phone phone)
  {
    phone.turnVolumeDown();

  }
}

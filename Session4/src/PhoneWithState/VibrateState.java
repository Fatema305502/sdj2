package PhoneWithState;

public class VibrateState implements PhoneState
{
  @Override public void onReceiveMessage(String txt, Phone phone)
  {
    phone.vibrate();

  }

  @Override public void onReceiveCall(Phone phone)
  {
    phone.vibrate();

  }

  @Override public void onVolumeButtonUp(Phone phone)
  {
    phone.setState(new SoundState());

  }

  @Override public void onVolumeButtonDown(Phone phone)
  {
    phone.setState(new SilentState());

  }
}

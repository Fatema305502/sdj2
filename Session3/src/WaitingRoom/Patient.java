package WaitingRoom;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Patient implements PropertyChangeListener
{
  private int ticketNumber;

  public Patient(int ticketNumber)
  {
    this.ticketNumber = ticketNumber;
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {

  }
}

package TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Taxi implements PropertyChangeListener
{
  private int id;
  private PropertyChangeSubject subject;

  public Taxi(int id, PropertyChangeSubject subject)
  {
    this.id = id;
    this.subject = subject;
  }

  private void reactToChange(PropertyChangeEvent evt)
  {
    String color = evt.getNewValue().toString();
    if(color.equals("GREEN"))
      move();
    if(color.equals("YELLOW"))
      move();
    if(color.equals("RED"))
      stop();
  }

  private void stop()
  {
    System.out.println("STOPPING" + id);
  }

  public void move()
  {
    System.out.println("VROOM VROOM!" + id);
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    reactToChange(evt);
  }


}

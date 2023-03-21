package TrafficLight;

import java.beans.PropertyChangeListener;

public interface PropertyChangeSubject
{
  public void addPropertyChangeLister(PropertyChangeListener listener);
  public void addPropertyChangeLister(String name, PropertyChangeListener listener);
  public void removePropertyChangeListener(PropertyChangeListener listener);
  public void removePropertyChangeListener(String name, PropertyChangeListener listener);
}

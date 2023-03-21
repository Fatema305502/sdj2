package TrafficLight;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TrafficLight implements PropertyChangeSubject
{
  private String lightColor;
  private PropertyChangeSupport propertyChangeSupport;

  public TrafficLight()
  {
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  public void setColor(String color){
    String oldColor=lightColor;
    lightColor=color;
    propertyChangeSupport.firePropertyChange("Lightchanged",oldColor,color);
  }


  @Override public void removePropertyChangeListener(PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name, PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(name, listener);
  }


  @Override public void addPropertyChangeLister(PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  @Override public void addPropertyChangeLister(String name, PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(name, listener);
  }


}

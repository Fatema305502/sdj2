package TrafficLight;

public class Main
{
  public static void main(String[] args)
  {
    TrafficLight trafficLight=new TrafficLight();
    Car car1=new Car(1,trafficLight);
    Car car2=new Car(2,trafficLight);
    Taxi taxi1= new Taxi(3,trafficLight);
    trafficLight.addPropertyChangeLister(car1);
    trafficLight.addPropertyChangeLister(car2);
    trafficLight.addPropertyChangeLister(taxi1);


    trafficLight.setColor("GREEN");
    trafficLight.setColor("Yellow");


  }
}

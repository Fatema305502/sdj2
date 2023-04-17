package SeaBearExercise;
/* SeaBearImpl class that implements this interface by printing out appropriate messages for each method call.*/
public class SeaBearImpl implements SeaBear
{
  public void view(String visitor) {
    System.out.println("Bear is being viewed by " + visitor);
  }

  public void pet(String visitor) {
    System.out.println("Bear is being petted by " + visitor);
  }

  public void feed(String zookeeper) {
    System.out.println("Bear is being fed by " + zookeeper);
  }
}

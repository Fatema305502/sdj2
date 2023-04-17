package SeaBearExercise;
/* Main class that creates instances of SeaBearImpl and SeaBearGuard,
 and calls the assessVisitor() method on the guard object with different visitor types to test the behavior of the system.*/
public class Main
{
  public static void main(String[] args) {
    SeaBear seaBear = new SeaBearImpl();
    SeaBearGuard seaBearGuard = new SeaBearGuard(seaBear);

    seaBearGuard.assessVisitor("adult");
    seaBearGuard.assessVisitor("zookeeper");
    seaBearGuard.assessVisitor("child");
  }
}

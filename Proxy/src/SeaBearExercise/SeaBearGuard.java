package SeaBearExercise;
/*SeaBearGuard class that takes a SeaBear object as input and assesses the visitors to control their access to the bear.
 If the visitor is a zookeeper, the guard feeds the bear. If the visitor is a child, the guard lets them pet the bear.
 Otherwise, the guard lets the visitor view the bear.*/
public class SeaBearGuard
{
  private SeaBear seaBear;

  public SeaBearGuard(SeaBear seaBear) {
    this.seaBear = seaBear;
  }

  public void assessVisitor(String visitor) {
    if (visitor.equals("zookeeper")) {
      seaBear.feed(visitor);
    } else if (visitor.equals("child")) {
      seaBear.pet(visitor);
    } else {
      seaBear.view(visitor);
    }
  }

}
/*the SeaBearGuard acts as a proxy for the SeaBearImpl,
controlling the access to the SeaBear object based on the type of visitor.
 The SeaBearImpl class only defines the behavior of the bear (viewing, petting,
and feeding), while the SeaBearGuard class defines the rules for who can perform each action.*/
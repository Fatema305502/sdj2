package Bridge;

public interface Lane
{
  void enterFromTheLeft(); //Allowed , when no cars form the right are on the lane
  void exitToTheRight(); //A car has left the lane to the right
  void enterFromTheRight(); //Allowed when no cars from the left ar on the lane
  void exitToTheLeft(); //A car has left the lane to the left
}

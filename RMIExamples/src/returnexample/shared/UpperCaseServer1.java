package returnexample.shared;

import java.rmi.Remote;

public interface UpperCaseServer1 extends Remote
{
  String toUpperCase(String str) throws RuntimeException;

}

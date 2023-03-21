import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLeapYear
{
  LeapYear leapYear=new LeapYear();

  @Test
  void test1604(){
    assertTrue(LeapYear.isLeapYear(1604));
  }

  @Test
  void test1600(){
    assertTrue(LeapYear.isLeapYear(1600));
  }

  @Test
  void test1983(){
    assertTrue(LeapYear.isLeapYear(1983));
  }

  @Test
  void test1900(){
    assertFalse(LeapYear.isLeapYear(1900));
  }

}

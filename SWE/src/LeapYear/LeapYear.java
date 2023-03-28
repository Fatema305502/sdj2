package LeapYear;

public class LeapYear
{

  public static boolean isLeapYear(int year)
  {

    boolean leap = false;

    if (year % 4 != 0)
    {
      leap = false;
    }
    else if (year % 400 == 0)
    {
      leap = true;
    }
    else if (year % 100 == 0)
    {
      leap = false;
    }
    else
    {
      leap = true;
    }
    return false;

  }
}

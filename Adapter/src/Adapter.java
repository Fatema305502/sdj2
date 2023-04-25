import parser.ParserException;
import parser.XmlJsonParser;

public class Adapter implements Persistence
{

  private XmlJsonParser adaptee;

  public Adapter()
  {
    adaptee = new XmlJsonParser();
  }
  @Override public void save(Object o)
  {

    try
    {
      adaptee.toXml(o, "testFile");
    }
    catch (ParserException e)
    {
      e.printStackTrace();
    }
  }

  }


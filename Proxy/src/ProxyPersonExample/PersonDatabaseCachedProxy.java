package ProxyPersonExample;

public class PersonDatabaseCachedProxy implements PersonCollection
{
  //den kender til PersonDataBase Klassen
  private PersonDatabase realSubject;
  private Person lastPersonFound;

  public PersonDatabaseCachedProxy(PersonDatabase realSubject)
  {
    this.realSubject = realSubject;
  }

  @Override public Person getPersonWithName(String name)
  {
    if(lastPersonFound != null && lastPersonFound.getName().equals(name))
    {
      System.out.println("PERSON IN PROXY WAS FOUND");
      return lastPersonFound;
    }
    lastPersonFound = realSubject.getPersonWithName(name);
    return lastPersonFound;
  }
}

package ProxyPersonExample;

public class PersonCacheTester
{
  public static void main(String[] args)
  {
    Person p1 = new Person("bob");
    Person p2 = new Person("alice");

    PersonDatabase personDatabase = new PersonDatabase();
    personDatabase.add(p1);
    personDatabase.add(p2);

    PersonDatabaseCachedProxy personDatabaseCachedProxy = new PersonDatabaseCachedProxy(personDatabase);

    PersonCollection personCollection = personDatabaseCachedProxy;
    System.out.println(personCollection.getPersonWithName("bob"));
    System.out.println(personCollection.getPersonWithName("bob"));

  }

  }



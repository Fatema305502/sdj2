package ProxyExample;

public class ProxyPatternClient
{


  public static final String NAME = "Aayush Sharma";
  public static void main(String[] args) {
    InternetAccess internetAccess = new ProxyInternetAccess();
    internetAccess.grantInternetAccessToEmployees();
  }
}

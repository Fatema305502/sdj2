package ImageExample;

public class Client
{

  public static void main(String[] args) {
    Image image1 = new ProxyImage("image1.jpg");
    Image image2 = new ProxyImage("image2.jpg");

    // The real image is only loaded from disk when it is needed
    image1.display();
    image2.display();
  }
}

package ImageExample;

public interface Image
{
  void display();
}


/*
* Explaining
* In this example, we have an interface called Image that defines the display() method.
*  The RealImage class is the actual implementation of the Image interface that loads the image from disk and displays it on the screen.
*  The ProxyImage class is a proxy for the RealImage class that delays the creation of the RealImage object until it is actually needed.

In the ProxyImage class, the display() method first checks if the RealImage object has been created.
*  If it hasn't, it creates a new RealImage object with the given filename and then calls the display() method on that object.
*  If the RealImage object has already been created, the display() method simply calls the display() method on the existing object.

The Client class demonstrates how the ProxyImage object can be used.
*  It creates two ProxyImage objects with different filenames, but the real images are only loaded from disk when they are actually displayed on the screen*/

package simplechat.client;


import javafx.application.Application;

//The only reason for this class is because JavaFX would require some additional settings otherwise.
//In other projects, we would likely see "SimpleChatApp" contain this main method instead.
public class RunSimpleChatApp
{

  public static void main(String[] args)
  {
    Application.launch(SimpleChatApp.class);
  }

}

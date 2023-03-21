package Radiator;

import PhoneWithState.PhoneState;

public class Radiator
{


  private RadiatorState currentState;
  public void TurnUp(){


  }
  public void turnDown(){

  }
  public void getPower(){
    System.out.println(currentState.getPower());
  }
  public void setPowerState(RadiatorState state){
    this.currentState=state;
  }
}

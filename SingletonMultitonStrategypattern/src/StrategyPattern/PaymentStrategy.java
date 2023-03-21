package StrategyPattern;

//https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial

public interface PaymentStrategy
{
  public void pay(int amount);

}

/*implement a simple Shopping Cart where we have two payment strategies -
 using Credit Card or using PayPal.
  First of all we will create the interface for our strategy pattern example,
 in our case to pay the amount passed as argument.*/
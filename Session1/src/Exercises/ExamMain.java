package Exercises;

import java.util.Scanner;

public class ExamMain
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);

    ExamTimer et=new ExamTimer();

    int num1;
    int num2;
    int userAnswer;
    int operationsCounter= 0;
    int correctAnswersCounter= 0;
    int wrongAnswerCounter=0;

    et.run();
    System.out.println("----------- Quiz ----------");

    /*while (et.isAlive())
    {
      num1= (int)(Math.random()*10);
      num2= (int)(Math.random()*10);

      System.out.println(num1+" + "+num2+"  =  ");
      userAnswer=input.nextInt();

      if(userAnswer==num1+num2){
        correctAnswersCounter++;

      }else
        wrongAnswerCounter++;
      operationsCounter++;
    }*/

    System.out.println("Time end...\n");

    System.out.println("-------Result-------");
    System.out.println("Number of operations :      " + operationsCounter);
    System.out.println("Number of correct answers:  "+ correctAnswersCounter);
    System.out.println("Number of wrong answer:    " + wrongAnswerCounter);

  }
}

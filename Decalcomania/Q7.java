/**********************************************************
File: Q7.java
Purpose: Free program
Author: Jin Ha Joo
Date: Feb 14, 2017
Based on: ICS3U Java Assignment 1, Question 7
**********************************************************/
import java.util.Scanner;
import java.util.Random;
public class Q7{
   public static void main (String [] args)throws InterruptedException{
   
   // var dec
      String name;
      int max;
      Scanner inData1 = new Scanner(System.in);
      Scanner inData2 = new Scanner(System.in);
      
   // intro
      System.out.println("What is your name!");
      name = inData1.nextLine();
      Thread.sleep(2000);
      System.out.println("Ok, " + name + " we are going to play a game. \n If you win, you survive, if you lose, you will die.");
      Thread.sleep(2000);
      System.out.println("Neither the pauper nor the king will get out of this world alive!"); 
      Thread.sleep(3000);
   //explanation
      System.out.println("Your going to guess, a number that I am thinking.");
      Thread.sleep(1000);
      System.out.println("Enter the maximum value of the number!");
      max = inData2.nextInt();
      Random x = new Random();
      int ans = x.nextInt(max);
      int tries = 0;
      int guess, wrong;
      boolean w == false;
   
   //Game
      while (w = false);
      System.out.println("Guess my number from 1 to " + max + ", the mortals shall pay for what they have done!");
      wrong = inData2.nextInt();
      tries++;
      if(wrong < 1 || max < wrong){
         System.out.println("Your dumb, Read the question carefully.");
         Thread.sleep(1000);
      }
      else if (wrong > ans){
         System.out.println("That is too high!");
         Thread.sleep(1000);
      }
      else if (wrong < ans){
         System.out.println("That is too low!");
         Thread.sleep(1000);
      }
      else if (wrong == ans){
         w = true;
         System.out.println("I lost, but they will rise from the ashes of what was…");
         System.out.println("To smite the transgressors and reclaim their glory.");     
         Thread.sleep(1000);
      }
   
      System.out.println("So it took you " + tries + " tries to solve this easy question...");
   
   }
}
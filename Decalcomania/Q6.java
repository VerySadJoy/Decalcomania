/**********************************************************
File: Q6.java
Purpose: Free program
Author: Jin Ha Joo
Date: Feb 14, 2017
Based on: ICS3U Java Assignment 1, Question 6
**********************************************************/
import java.util.Scanner;
public class Q6{
   public static void main (String [] args)throws InterruptedException{
     
   //var dec
      String name;
      int ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10;
   
      Scanner inData1 = new Scanner(System.in);
      Scanner inData2 = new Scanner(System.in);
   //Beginning
      System.out.println("All hail, Macbeth! Hail to thee, thane of Glamis.");
      Thread.sleep(1000);
      System.out.println("All hail, Macbeth! Hail to thee, thane of Cawdor.");
      Thread.sleep(1000);
      System.out.println("All hail, Macbeth, that shalt be king hereafter!");
      Thread.sleep(2000);
      System.out.println("Art thee confused? \n1. Aye \t \n2. Nay");
      ans1 = inData1.nextInt();
      if (ans1 == 2){
         System.out.println("No, thou has't to beest confused! \nThee wilt kicketh the bucket because thee lied.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans1 == 1){
         System.out.println("Doth thee not understandeth mine words?");
         
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 2
      Thread.sleep(2000);
      System.out.println("1. Aye \t \n2. Nay");
      ans2 =  inData1.nextInt();
      if (ans2 == 2){
         System.out.println("No, thee don't understandeth me! \nThee wilt kicketh the bucket because thee lied ");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans2 == 1){
         System.out.println("What is thy name?");
         
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 3
      Thread.sleep(2000);
      name = inData2.nextLine();
      Thread.sleep(2000);
      System.out.println("All hail, " + name + "! Hail to thee, thane of Glamis.");
      Thread.sleep(1000);
      System.out.println("All hail, " + name + "! Hail to thee, thane of Cawdor.");
      Thread.sleep(1000);
      System.out.println("All hail, " + name + ", that shalt be king hereafter!");
      Thread.sleep(2000);
      System.out.println("If 't be true thee wanteth to beest a king, thee needeth to killeth King Duncane.");
      Thread.sleep(1000);
      System.out.println("Wilt thee killeth the king?");
      System.out.println("1. Aye \t \n2. Nay");
      ans3 = inData1.nextInt();
      if (ans3 == 2){
         System.out.println("Recreant doth not deserve to beest our king!  \nThee hath kicked the bucket because thee art afeard.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans3 == 1){
         System.out.println("What doth thee wanteth to useth to killeth the king ");
      
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 4
      Thread.sleep(2000);
      System.out.println("1. Sword \t \n2. Gun");
      ans4 =  inData1.nextInt();
      if (ans4 == 2){
         System.out.println("Thither is no gun in medieval age.  \nthee hath kicked the bucket because thee art like a stone.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans4 == 1){
         System.out.println("Thee hath slained the king and becameth the king of Scotland.");
         
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 5
      Thread.sleep(2000);
      System.out.println("But people of Scotland do not like you, and a soldier named MacDuff wants to kill you.");
      System.out.println("Wilt thee killeth MacDuff?");
      System.out.println("1. Aye \t \n2. Nay");
      ans5 =  inData1.nextInt();
      if (ans5 == 1){
         System.out.println("Thee art so cruel, thee hath lost faith from the people. \nThee hath kicked the bucket because people don't like thee anymore.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans5 == 2){
         System.out.println("Everyone think you are a merciful person and believe that you will forgive them no matter what they do.");
         
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 6
      Thread.sleep(2000);
      System.out.println("As a result, those gents rebelled.");
      System.out.println("Wilt thee asketh the witches for holp?");
      System.out.println("1. Aye \t \n2. Nay");
      ans6 =  inData1.nextInt();
      if (ans6 == 2){
         System.out.println("Thee cannot doth everything by yourself. \nThee hath kicked the bucket because thee overestimated thyself.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans6 == 1){
         System.out.println(name + "," + name + "," + name + ", Cuidado Macduff. Cuidado com o thane de Fife. Me perdoe. Suficiente.");
         
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 7
      Thread.sleep(2000);
      System.out.println("Thee realised the witches art Portugese, doth thee speaketh Portugese?");
      System.out.println("1. Aye \t \n2. Nay");
      ans7 =  inData1.nextInt();
      if (ans7 == 1){
         System.out.println("Cease falsing! \nThee hath kicked the bucket because thee art arrested for bearing false statement.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      } 
      else if (ans7 == 2){
         System.out.println("We wast testing thee, we art not Portugese.");
         Thread.sleep(2000);
         System.out.println("Beware MacDuff. Beware the thane of Fife. Dismiss me. Enough.");
         Thread.sleep(2000);
         System.out.println("Be bloody, bold, and resolute. Laugh to scorn. The power of man, for none of woman born, shall harm" + name + ".");
         Thread.sleep(2000);
         System.out.println("Be lion-mettled, proud, and take no care, Who chafes, who frets, or where conspirers are. " + name + " shall never vanquished be until Great Birnam Wood to high Dunsinane Hill shall come against him.");
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 8
      Thread.sleep(2000);
      System.out.println("Thee hath returned to the castle, but thee see most wondrous Birnam Wood coming to High Dunsinane Hill to square thee. wilt thee square those folk?");
      System.out.println("1. Aye \t \n2. Nay");
      ans8 =  inData1.nextInt();
      if (ans8 == 2){
         System.out.println("Thee art just cowering in fear and covering thy eyes, just wend to the lodging whither thee feeleth safe. \nThee hath kicked the bucket because the safe lodging thee bethought wast thy grave.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans8 == 1){
         System.out.println("Thee see MacDuff, so thee tooketh the sword that hath killed King Duncane, but thee recall witches saying that that gent should beware MacDuff!");
         
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
      //Question 9
      Thread.sleep(2000);
      System.out.println("Thee eke recalled that anyone hath a mother cannot killeth that gent. But thee realised MacDuff's parents art gay, so that gent doest not has't a mother. Wilt thee still square that gent?");
      System.out.println("1. Aye \t \n2. Nay");
      ans9 =  inData1.nextInt();
      if (ans9 == 2){
         System.out.println("A afeard sir doth not deserve to liveth. \nThee hath kicked the bucket because thee art afeard and thy body start to shiver, but thee could not cease 't.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans9 == 1){
         System.out.println("Thee see MacDuff, so thee tooketh the sword that hath killed King Duncane, but thee recall witches saying that that gent should beware MacDuff!");
         
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
      
      }
      Thread.sleep(3000);
      System.out.println("MacDuff: Go kill yourself " + name + ".");
      Thread.sleep(3000);
      System.out.println(name + ": Why should I commit suicide like one of the ancient Romans? As long as I see enemies of mine alive, I would rather see my sword wound them than me.");
      Thread.sleep(4000);
      System.out.println("MacDuff: Turn, hellhound, turn!");
      Thread.sleep(3000);
      System.out.println(name + ": You are the only man I have avoided. But go away now.");
      Thread.sleep(3000);
      System.out.println("MacDuff: My voice is in my sword. Thou bloodier villain. Than terms can give thee out!");
      Thread.sleep(4000);
      System.out.println(name + ": Accursèd be that tongue that tells me so, For it hath cowed my better part of man! And be these juggling fiends no more believed, That palter with us in a double sense, That keep the word of promise to our ear, And break it to our hope. I’ll not fight with thee.");
      Thread.sleep(7000);
      System.out.println("MacDuff: Then yield thee, coward, And live to be the show and gaze o' th' time. We’ll have thee, as our rarer monsters are, Painted on a pole, and underwrit, “Here may you see the tyrant.”");
      Thread.sleep(7000);
      System.out.println("To kiss the ground before young Malcolm’s feet, And to be baited with the rabble’s curse. Though Birnam Wood be come to Dunsinane, And thou opposed, being of no woman born, Yet I will try the last. Before my body I throw my warlike shield. Lay on, Macduff, And damned be him that first cries, “Hold, enough!”");
      Thread.sleep(8000);
      //Question 10
      Thread.sleep(2000);
      System.out.println("Thee realised thou has't has't a grenade in thy pocket. Wilt thee throweth that to MacDuff?");
      System.out.println("1. Aye \t \n2. Nay");
      ans10 =  inData1.nextInt();
      if (ans10 == 1){
         System.out.println("Tis pondered very rude to useth grenade in a swordfight. \nThee hath kicked the bucket because thee art rude.");
         Thread.sleep(2000);
         System.out.println("Game Over");
         return;
      }
      else if (ans10 == 2){
         System.out.println("Valorous sir, thee didst not violate the rule of swordfight. But MacDuff hath killed ya.");
         System.out.println("Game Over, Grant you mercy for playing.");
      }
      
      else{
         System.out.println("Invalid Data, Game Over");
         return;
         
      }
   
   }
}

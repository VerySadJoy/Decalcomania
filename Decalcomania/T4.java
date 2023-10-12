import ch.aplu.turtle.*;
import java.awt.Color;

public class T4{
   public static void turtle1 (Turtle t1){
      t1.speed(100000);
      t1.ht();
      t1.setPos(-75, 100);
      t1.setPenColor(Color.black);
      t1.rt(90).fd(150).rt(90).fd(200).rt(90).fd(150).rt(90).fd(200);
      for (int i = 0; i < 21; i++){
         t1.rt(90).fd(150);
         t1.rt(90).fd(1);
         t1.rt(90).fd(150);
         t1.rt(90).fd(-1);
      }
   }
   public static void turtle2 (Turtle t2){
      t2.speed(100000);
      t2.ht();
      t2.setPos(-50, 35);
      t2.setPenColor(Color.black);
      t2.rt(90).fd(30).rt(90).fd(20).rt(90).fd(30).rt(90).fd(20);
   }
   public static void turtle3 (Turtle t3){
      t3.speed(100000);
      t3.ht();
      t3.setPos(50, 35);
      t3.setPenColor(Color.black);
      t3.rt(270).fd(30).rt(270).fd(20).rt(270).fd(30).rt(270).fd(20);
   }
   public static void turtle4 (Turtle t4){
      t4.speed(100000);
      t4.ht();
      t4.setPos(-30 ,35);
      t4.setPenColor(Color.black);
      t4.rt(180);
      for (int i = 0; i < 5; i++){
         t4.fd(20).rt(90);
         t4.fd(1).rt(90);
         t4.fd(20).rt(90);
         t4.fd(-1).rt(90);
      }
   }
   public static void turtle5 (Turtle t5){
      t5.speed(100000);
      t5.ht();
      t5.setPos(40 ,35);
      t5.setPenColor(Color.black);
      t5.rt(180);
      for (int i = 0; i < 5; i++){
         t5.fd(20).rt(90);
         t5.fd(1).rt(90);
         t5.fd(20).rt(90);
         t5.fd(-1).rt(90);
      }
   }
   public static void turtle6 (Turtle t6){
      t6.speed(100000);
      t6.ht();
      t6.setPos(-13, -35);
      t6.setPenColor(Color.black);
      t6.rt(90).fd(30).rt(-105).fd(58).rt(-150).fd(58);
   }
   public static void turtle7 (Turtle t7){
      t7.speed(100000);
      t7.ht();
      t7.setPos(-30, -55);
      t7.setPenColor(Color.red);
      t7.rt(90).fd(60);
   }
   public static void turtle8 (Turtle t8){
      t8.speed(100000);
      t8.ht();
      t8.setPos(-13, -35);
      t8.setPenColor(Color.black);
      t8.rt(180);
      for (int i = 0; i <= 15; i++){
         t8.fd(10).rt(90);
         t8.fd(-1).rt(90);
         t8.fd(10).rt(90);
         t8.fd(1).rt(90);
      }
   }
   public static void finalmath (){
      Turtle first = new Turtle(Color.black);
      turtle1(first);
      Turtle second = new Turtle(first, Color.black);
      turtle2(second);
      Turtle third = new Turtle(first, Color.black);
      turtle3(third);
      Turtle fourth = new Turtle (first, Color.black);
      turtle4(fourth);
      Turtle fifth = new Turtle (first, Color.black);
      turtle5(fifth);
      Turtle sixth = new Turtle (first, Color.black);
      turtle6(sixth);
      Turtle seven = new Turtle (first, Color.black);
      turtle7(seven);
      Turtle eight = new Turtle (first, Color.black);
      turtle8(eight);
   }
   public static void main (String [] args){
      finalmath();
   }
}
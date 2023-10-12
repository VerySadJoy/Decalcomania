import java.util.*;
public class T2{
   public static void main (String args []){
      ArrayList al = new ArrayList();
      al.add(10);
      al.add(42);
      al.add(34);
      al.add(100);
      al.add(1);
      al.add(23);
      Object[] objectArray = al.toArray();
      int[] intArray = new int[objectArray.length];
      for (int i = 0; i < objectArray.length; i++){
         intArray[i] = Integer.valueOf(objectArray[i].toString()); 
      }
      System.out.println(intArray);
   }
}
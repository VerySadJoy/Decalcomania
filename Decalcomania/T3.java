import java.util.Scanner;
import java.io.*;
public class T3{
   public static void main (String args []) throws IOException{
      File dataFile = new File("Document.txt");
      Scanner scanFile = new Scanner (dataFile);   
      long inp, num;
      boolean prime = true;
      while (scanFile.hasNext()){
         if (scanFile.hasNextLong()){                                 
            inp = scanFile.nextLong();
            for (int i = 2; i <= inp/2; i++){
               num = inp%i;
               if (num == 0){
                  prime = false;
                  break;
               }
            }
         }
         else{
            scanFile.next(); 
         }
         if (prime){
            System.out.println("That is a Prime Number!");
         }
         else{
            System.out.println("That is not a Prime Number!");
         }
      }
   }
}
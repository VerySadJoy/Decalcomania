import java.util.Scanner;
import java.io.*;

public class T1{
   public static void main (String args []) throws IOException{
      File dataFile = new File("Document.txt");
      Scanner scanFile = new Scanner (dataFile);
   
      int num1, num2;
      while (scanFile.hasNext()){
         if (scanFile.hasNextDouble()) {                                 
            System.out.println(scanFile.nextDouble()); 
         }
         else{
            scanFile.next(); 
         }
      }
   }
}
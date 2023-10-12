import java.util.Scanner;
import java.io.*;
public class practice{
   private static final String [] COLOUR = {"yellow", "blue", "cyan", "green", "pink", "white", "red", "orange", "black"};
   public static void main (String [] args) throws IOException{
      int value = 0, n1 = 0, n2 = 0;
      Board game = new Board (9,9);
      File dataFile = new File("Map.txt");
      Scanner scanFile = new Scanner(dataFile);
      while(scanFile.hasNext()){
         value = scanFile.nextInt();
         if (value > 0){
            game.putPeg(COLOUR [value - 1], n1, n2);
            n2++;
         }
         else {
            n2++;
         }
         if (n2 == 9){
            n1++;
            n2 = 0;
         }
      }
   }
}
import java.util.Scanner;
public class practicing{
   public static void main (String args []){
   // var dec
      Scanner inData = new Scanner(System.in);
      int num;
   // input
      System.out.println("Enter a number");
      num = inData.nextInt();
   // output using for
      for (int i = 1; i <= num; i++){
         for (int j = num; j >= i; j--){
         System.out.print(" ");
         }
            for (int k = 1; k <= i; k++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
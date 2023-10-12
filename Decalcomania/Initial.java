import java.util.Scanner;
public class Initial{
   public static void main (String args []){
   // var dec
      Scanner inData = new Scanner (System.in);
      String fir, las;
   // input
      System.out.print("Enter your first name: ");
      fir = inData.nextLine();
      fir = fir.toUpperCase();
      System.out.print("Enter your last name: ");
      las = inData.nextLine();
      las = las.toUpperCase();
   // output
      String ini = fir.substring(0, 1) + las.substring(0, 1);
      System.out.println("Your initial is " + ini);
   }
}
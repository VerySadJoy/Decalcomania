import java.util.Scanner;
public class Method{ 
   public static void main(String[] args) {
      Scanner inData = new Scanner(System.in);
      System.out.println("Enter a value!");
      int a = inData.nextInt();
      System.out.println("Enter a value!");
      int b = inData.nextInt();
      int c = minFunction(a, b);
      System.out.println("Minimum Value = " + c);
   }
   public static int minFunction(int n1, int n2) {
      int min;
      min = n1 + n2;
      n1 = min/n1;
      min = n1+ n2+ min;
      return min; 
   }
}
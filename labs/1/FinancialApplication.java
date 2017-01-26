import java.util.Scanner;
 
public class FinancialApplication {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
      System.out.println("This Program Computes Gratuity.\n");
      System.out.println("Enter the subtotal and a gratuity rate: ");
      double subtotal = input.nextDouble();
      double gratuityRate = input.nextDouble();
      double gratuity = gratuityRate/10;
      double total = subtotal + gratuity;
       
      System.out.printf ("The gratuity is $" + gratuity + " and total is $" + total + "\n");
  }
}
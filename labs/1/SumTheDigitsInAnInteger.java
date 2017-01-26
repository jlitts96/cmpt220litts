import java.util.Scanner;
 
public class SumTheDigitsInAnInteger {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This Program Sums The Digits In An Integer Between 0 and 1000.\n");
    System.out.println("Enter a number between 0 and 1000: ");
    double number = input.nextDouble();
    double digit1 = number%10;
    double removeDigits1 = (int)number/10;
    double digit2 = removeDigits1%10;
    double removeDigits2 = (int)removeDigits1/10;
    double digit3 = removeDigits2%10;
     
    double sumOfDigits = digit1 + digit2 + digit3;
     
    System.out.printf ("The sum of the digits is " + sumOfDigits + "\n");
  }
}
import java.util.Scanner;
 
public class RegPolygonArea {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of sides: ");
    double sides = input.nextDouble();
	System.out.print("Enter the side: ");
	double length = input.nextDouble();



    double area = (Math.pow(length, 2) * sides) / (4 * Math.tan(Math.PI / sides));
    System.out.println("The area of the polygon is: " + area);
  }
}
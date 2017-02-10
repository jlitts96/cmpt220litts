import java.util.Scanner;
 
public class PentagonArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a length from the center to a vertex: ");
    double radius = input.nextDouble();

    double s = 2 * radius * Math.sin(Math.PI / 5);
    double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
	
    System.out.println("The area of the pentagon is: " + Math.round(area * 100.0) / 100.0);
  }
}
import java.util.Scanner;
 
public class StudentGrade {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Please enter the following as a percentage... : ");
	System.out.println("Midterm exam : ");
	double midterm = input.nextDouble();
    System.out.println("Final exam : ");
	double finalexam = input.nextDouble();
    System.out.println("Projects : ");
	double projects = input.nextDouble();
	System.out.println("Homework and Labs : ");
	double HomeworkandLabs = input.nextDouble();
	
	double score = (midterm * 0.20) + (finalexam * 0.20) + (projects * 0.20) + (HomeworkandLabs *0.40);
	if (score >= 95.0)
	  System.out.print("Your final grade is: A");
	else if (score >= 90.0)
	  System.out.print("Your final grade is: A-");
	else if (score >= 87.0)
	  System.out.print("Your final grade is: B+");
	else if (score >= 83.0)
	  System.out.print("Your final grade is: B");
	else if (score >= 80.0)
	  System.out.print("Your final grade is: B-");
	else if (score >= 77.0)
	  System.out.print("Your final grade is: C+");
	else if (score >= 73.0)
	  System.out.print("Your final grade is: C");
	else if (score >= 70.0)
	  System.out.print("Your final grade is: C-");
	else if (score >= 65.0)
	  System.out.print("Your final grade is: D+");  
	else if (score >= 60.0)
	  System.out.print("Your final grade is: D");
	else
	  System.out.print("Your final grade is: F");

  }
}	


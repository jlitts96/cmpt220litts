//File GPAcalculator.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Lab 1
//Due Date: May 11, 2017

//This program calculates a student's GPA.
import java.util.Scanner;
 
public class GPAcalculator {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the following as a percentage... \n");
    System.out.print("Midterm Exam: ");
	double midterm = input.nextDouble();
	
	System.out.print("Final Exam: ");
	double finalex = input.nextDouble();
	
	System.out.print("Projects: ");
	double projects = input.nextDouble();
	
	System.out.print("Homework and Labs: ");
	double HomeworkandLabs = input.nextDouble();
	
	double total = (midterm * 0.20) + (finalex * 0.20) + (projects * 0.20) + (HomeworkandLabs *0.40);
	System.out.println("Your final grade is: " + total + "\n");
  }
}
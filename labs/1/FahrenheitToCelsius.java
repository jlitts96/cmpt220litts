//File FahrenheitToCelsius.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Lab 1
//Due Date: May 11, 2017

//This program converts the imputted temperature in Fahrenheit to Celsius.

import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("Fahrenheit " + fahrenheit + "is" + celsius + " in Celsius.");
  }
}
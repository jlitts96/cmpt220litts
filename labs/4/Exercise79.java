//File Exercise79.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: May 11, 2017

//This file finds the smallest element in an array of double values. It asks the user to enter ten numbers, then returns the minimum value.


import java.util.Scanner;


public class Exercise79 {

  static final int length = 10;
  public static void main(String[] args) {

    double[] n = new double[length];
    Scanner input = new Scanner(System.in);

    System.out.print("Enter " + length + " numbers: ");
    for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

    System.out.println("The minimum number is: " + min(n));
  }

  public static double min(double[] array) {

    double min = array[0];
    for (int i = 0; i < array.length; i++) {

      if (min > array[i]) min = array[i];
    }

    return min;
  }
}
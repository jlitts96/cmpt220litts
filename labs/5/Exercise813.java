//File Exercise813.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: May 11, 2017

//This program returns the location of the largest element  in a two-dimensional array.

import java.util.Scanner;

public class Exercise813 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];

    System.out.println("Enter the array below: ");
    for (int i = 0; i < row; i++)
      for (int k = 0; k < column; k++)
        m[i][k] = input.nextDouble();


    int[] location = locateLargestElement(m);
    System.out.printf("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
  }

  public static int[] locateLargestElement(double[][] a) {

    int[] location = new int[] { 0, 0 };
    double largestElement = a[0][0];
    for (int i = 0; i < a.length; i++) {

      for (int k = 0; k < a[i].length; k++) {

        if (a[i][k] > largestElement) {
          location[0] = i; // row
          location[1] = k; // column
          largestElement = a[i][k];
        }

      }
    }

    return location;
  }
}
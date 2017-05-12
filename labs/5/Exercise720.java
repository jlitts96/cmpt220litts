//File Exercise720.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: May 11, 2017

//This program uses selection sort in order to swap the largest number with the last number 

import java.util.Scanner;

public class Exercise720 {

  static final int xlength = 10;
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double[] numbers = new double[xlength];

    System.out.print("Enter " + xlength + " numbers: ");
    for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();

    selectionSort(numbers);
    printArray(numbers, 10);
  }

  public static void selectionSort(double[] numbers) {

    for (int i = numbers.length - 1; i > 1 ; i--) {
      int currentIndex = i;
      double currentLargest = numbers[i];

      for (int k = i - 1; k > 0; k--) {
        if (currentLargest < numbers[k]) {
          currentIndex = k; // save new high index
          currentLargest = numbers[k];
        }
      }

      // if currentIndex changed swap
      if (currentIndex != i) {
        double temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[i];
        numbers[i] = temp;
      }
    }
  }

  public static void printArray(double[] array, int numberPerLine) {

    for (int i = 0; i < array.length; i++) {

      System.out.printf("%5.2f ", array[i]);
      if ((i + 1) % numberPerLine == 0) System.out.println("");
    }
  }
}
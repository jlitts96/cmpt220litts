//File Exercise718.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: May 11, 2017

//This program is a sorting method that performs the bubble sort algorithm.

public class Exercise718 {

  public static void main(String[] args) {

    double[] numbers = new double[100];

    for (int i = 0; i < numbers.length ; i++) {
      numbers[i] = Math.random() * 200;
    }
    bubbleSort(numbers);
    printArray(numbers, 10);
  }

  public static void printArray(double[] array, int numbersPerLine) {

    for (int i = 0; i < array.length; i++) {

      System.out.printf("%4.0f ", array[i]);
      if ((i + 1) % numbersPerLine == 0) System.out.println("");
    }
  }

  public static void bubbleSort(double[] numbers) {

    boolean swap;
    do {
      swap = false;
      for (int i = 0; i < numbers.length - 1; i++) {

        if (numbers[i] > numbers[i + 1]) {
          double temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
          swap = true;
        }
      }
	  
    } while (swap);
  }
}
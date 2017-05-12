//File Exercise732.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: May 11, 2017

//This program partitions the list using a pivot.

import java.util.Scanner;

public class Exercise732 {


  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("First number is the size of array, second number is the pivot.");
    System.out.print("Enter a list: ");
    int size = input.nextInt();
    int[] list = new int[size];
    for (int i = 0; i < size; i++) list[i] = input.nextInt();

    partition(list);



  }

  public static int partition(int[] list) {

    int firstNumber = 0;
    int lowNumber = firstNumber + 1;
    int highNumber = list.length - 1;
    int pivot = list[firstNumber];

    while (highNumber > lowNumber) {
	
      while (lowNumber <= highNumber && list[lowNumber] <= pivot) lowNumber++;
      while (lowNumber <= highNumber && list[highNumber] > pivot) highNumber--;

      if (highNumber > lowNumber) {
        int temp = list[highNumber];
        list[highNumber] = list[lowNumber];
        list[lowNumber] = temp;
      }
    }

    while (highNumber >= lowNumber && list[highNumber] >= pivot) highNumber--;

    if (highNumber > firstNumber) {
      int temp = list[highNumber];
      list[highNumber] = list[firstNumber];
      list[firstNumber] = temp;
      return highNumber;
    } 
	else {
      return firstNumber;
    }
  }
}
//File Exercise731.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: May 11, 2017

//This program merges two sorted lists into a new sorted list.


import java.util.Scanner;

public class Exercise731 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // get first list and save to array
    System.out.print("Enter List1: ");
    int size = input.nextInt();
    int[] List1 = new int[size];
    for (int i = 0; i < List1.length; i++) List1[i] = input.nextInt();

    // get second list and save to array
    System.out.print("Enter List2: ");
    size = input.nextInt();
    int[] List2 = new int[size];
    for (int i = 0; i < List2.length; i++) List2[i] = input.nextInt();

    int[] mergedList = merge(List1, List2);

    displayGrid(mergedList);
  }
  public static int[] merge(int[] List1, int[] List2) {

    int[] merge = new int[List1.length + List2.length];
    int m = 0, l1 = 0, l2 = 0;
    boolean isL1Done = false;
    boolean isL2Done = false;

    while (!isL1Done || !isL2Done) {

      if (l1 == List1.length) isL1Done = true;
      if (l2 == List2.length) isL2Done = true;

      if (isL1Done && isL2Done) break;

      if (!isL1Done && isL2Done) merge[m++] = List1[l1++];
      else if (!isL2Done && isL1Done) merge[m++] = List2[l2++];
      else if (List1[l1] <= List2[l2]) merge[m++] = List1[l1++];
      else if (List2[l2] <= List1[l1]) merge[m++] = List2[l2++];

    }
    return merge;
  }

  public static void displayGrid(int[] grid) {
    for (int i = 0; i < grid.length; i++) {

      System.out.printf("%-3d ", grid[i]);
      if ((i + 1) % 10 == 0)
        System.out.println("");
    }
  }
}
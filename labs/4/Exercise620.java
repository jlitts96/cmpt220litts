//File Exercise620.java
//Author: Jake Litts
//Course CMPT 220
//Assignment: Project 1
//Due Date: April 27, 2017

//This file counts the letters in a string.

import java.util.Scanner;

public class Exercise620 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String x = input.nextLine();

    System.out.println("The number of letters inside the string is: " + Letters(x));
  }
  
  public static int Letters(String x) {

    int letterAmount = 0;
    for (int i = 0; i < x.length(); i++) {
      if (isLetter(x.characterAt(i))) letterAmount++;
    }
    return letterAmount;
  }

  public static boolean isLetter(char l) {
    l = Character.toUpperCase(l);
    return (l >= 'A' && l <= 'Z');
  }
  
}


import java.util.Scanner;

public class Exercise_415 {

  private static final int INVALID_KEY = -1;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char j = input.next().charAt(0);

    int letter = correspondingNumber(j);

    if (letter != INVALID_KEY) {
      System.out.println("The corresponding number is " + letter);
    } else {
      System.out.println(j + " is an invalid input");
    }

  }

  public static int correspondingNumber(char j) {

    j = Character.toUpperCase(j);

    if (j >= 'A' && j <= 'O') {
      int number = 2; // where 'A' start
      int n = j - 'A';
      number += (n / 3);
      return number;
    }

    if (j >= 'P' && j <= 'S') return 7;
    if (j >= 'T' && j <= 'V') return 8;
    if (j >= 'W' && j <= 'Z') return 9;

    return INVALID_KEY;

  }
}
public class Exercise_513 {

  public static void main(String[] args) {

    int j = 0;

    while (Math.pow(j, 3) < 12000) {
      j++;
    }
	
    j--;
    System.out.println(j + " is the largest integer j, such that j^3 is less than 12,000");
    System.out.println("Proof: " + (j - 1) + "^3 = " + Math.pow(j - 1, 3));
    System.out.println("Proof: " + j + "^3 = " + Math.pow(j, 3));
    System.out.println("Proof: " + (j + 1) + "^3 = " + Math.pow(j + 1, 3));

  }
}
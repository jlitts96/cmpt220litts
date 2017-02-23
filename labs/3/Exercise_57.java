import java.text.DecimalFormat;

public class Exercise_57 {

  private static final double TuitionCost = 10000;
  public static void main(String[] args) {


    double increaseRate = 0.05;
    double tInTenYears = TuitionCost;
    double fourYearTuitionCost = 0;
    for (int i = 0; i < 10; i++) {
      tInTenYears *= (1 + increaseRate);
    }
		
		
    fourYearTuitionCost = tInTenYears;
    System.out.println("Tuition cost in 10 years: " + DecimalFormat.getCurrencyInstance().format(tInTenYears));
    for (int i = 0; i < 4; i++) {
      fourYearTuitionCost *= (1 + fourYearTuitionCost);

    }
    System.out.println("Total cost of 4 years starting today: " +
      DecimalFormat.getCurrencyInstance().format(tInTenYears));

  }
}
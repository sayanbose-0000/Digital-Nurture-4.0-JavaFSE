// FF(n) = FF(n-1) * (1 + r)
import java.util.Scanner;

class FinancialForecasting {
  static double futureVal(double initial, double rate, int year) {
    if (year == 0) return initial;
    return futureVal(initial * (1 + rate), rate, year -  1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter initial amount: ");
    double initial = sc.nextDouble();

    System.out.print("Enter growth rate (annual): ");
    double rate = sc.nextDouble();

    System.out.print("Enter no of years: ");
    int year = sc.nextInt();

    double res = futureVal(initial, rate, year);
    System.out.println("The result is: " + res);
  }
}


// Output
// ======

// User@bose /c/sayan/Digital-Nurture-4.0-JavaFSE/solutions/week1/dsa/Financial-Forecasting
// $ javac FinancialForecasting.java 
// User@bose /c/sayan/Digital-Nurture-4.0-JavaFSE/solutions/week1/dsa/Financial-Forecasting
// $ java FinancialForecasting
// Enter initial amount: 15000
// Enter growth rate (annual): 3
// Enter no of years: 8
// The result is: 9.8304E8
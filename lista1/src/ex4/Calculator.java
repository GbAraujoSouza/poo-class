package ex4;

/**
 * Calculator
 */
public class Calculator {

  public static double sum(double n1, double n2) {
    return n1 + n2;
  }

  public static double subtract(double n1, double n2) {
    return n1 - n2;
  }

  public static double multiply(double n1, double n2) {
    return n1 * n2;
  }

  public static double divide(double n1, double n2) {
    if (n2 == 0)
      return Double.NaN;
    return n1 / n2;
  }
}

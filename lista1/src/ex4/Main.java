package ex4;

//import ex4.Calculator.*;
import java.util.Scanner;
/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String userChoice;
    // Calculator Calculator = new Calculator();
    // System.out.println("######## Calculator App ########");
    // System.out.println("Chose an operation:");
    // System.out.println("[1] Sum\n[2] Subtraction\n[3] Division\n[4] Multiplication\nType 'S' for exit");
    // System.out.print("Operation: ");
    // userChoice = sc.nextLine();

    do {
      System.out.println("######## Calculator App ########");
      System.out.println("Chose an operation:");
      System.out.println("[1] Sum\n[2] Subtraction\n[3] Division\n[4] Multiplication\nType 'S' for exit");
      System.out.print("Operation: ");
      userChoice = sc.nextLine();

      if (userChoice.equals("s") || userChoice.equals("S"))
        break;
      double n1, n2, result = Double.NaN;
      System.out.print("n1: ");
      n1 = sc.nextDouble();
      sc.nextLine();
      System.out.print("n2: ");
      n2 = sc.nextDouble();
      sc.nextLine();
      switch (userChoice) {
        case "1":
          result = Calculator.sum(n1, n2);
          break;
        case "2":
          result = Calculator.subtract(n1, n2);
          break;
        case "3":
          result = Calculator.divide(n1, n2);
          break;
        case "4":
          result = Calculator.multiply(n1, n2);
          break;
      }
      clearScreen();
      System.out.println("Result: " + result);
    } while (userChoice != "S");

    sc.close();
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}

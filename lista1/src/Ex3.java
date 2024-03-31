import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final double pi = 3.14159;
    System.out.print("Digite o valor do raio r da esfera: ");
    double r = sc.nextDouble();
    double volume = (4 / 3) * pi * Math.pow(r, 3);

    System.out.println("O volume da esfera de raio r=" + r + " é " + volume);
    sc.close();
  }
}

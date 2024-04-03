import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double tempoGasto;
    final int KM_POR_LITRO = 12;
    tempoGasto = sc.nextDouble();
    sc.nextLine();
    double velMedia = sc.nextDouble();

    double distancia = tempoGasto * velMedia;

    double litros = distancia / 12;

    System.out.printf("Para esta viagem seriam necessários %.3f litros%n", litros);
    sc.close();
  }
}

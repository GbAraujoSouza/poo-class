import java.util.Scanner;
public class Ex2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] disponiveis = new int[3];
    int[] pedidos = new int[3];
    System.out.println("Digite a quantidade de refeicoes disponiveis");
    for (int i = 0; i < 3; i++){
      disponiveis[i] = sc.nextInt();
      sc.nextLine();
    }
    System.out.println("Digite a quantidade de pedidos para cada refeicao");
    for (int i = 0; i < 3; i++){
      pedidos[i] = sc.nextInt();
      sc.nextLine();
    }
    int ficouComFome = 0;

    for (int i = 0; i < 3; i++) {
      ficouComFome += (disponiveis[i] - pedidos[i] < 0) ? Math.abs(disponiveis[i] - pedidos[i]) : 0;
    }
    System.out.printf("%d Passageiros vao ficar com fome\n", ficouComFome);

    sc.close();
  }
}

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Pense em um número de 0 a 100: ");
    sc.nextLine();

    boolean acertou = false;
    int count = 0;
    int chute = (int) (Math.random() * 100 + 1);
    int[] nums = new int[101];
    for (int i = 0; i < 101; i++) {
      nums[i] = i;
    }
    int ini = 0, end = 100;

    while (!acertou) {
      count++;
      System.out.print("o valor pensado é " + chute + "?[s/n]");
      String acertouChute = sc.nextLine();
      if (acertouChute.equals("n")) {
        System.out.print("O número pensado é maior ou menor?[maior/menor]");
        String maiorMenor = sc.nextLine();
        if (maiorMenor.equals("maior")) {
          ini = chute + 1;
          chute = randomInterval(nums, ini, end);
          if (chute == -1) {
            System.out.println("MENTIROSO(A)");
            acertou = !acertou;
          }
        } else {
          end = chute - 1;
          chute = randomInterval(nums, ini, end);
          if (chute == -1) {
            System.out.println("MENTIROSO(A)");
            acertou = !acertou;
          }
        }
      } else {
        acertou = !acertou;
      }

    }

    System.out.println("O programa demorou " + count + " tentativas para acertar seu número");
    sc.close();
  }

  private static int randomInterval(int[] nums, int ini, int end) {
    if (ini > end) return -1;
    int n = (int) ((Math.random() * (end+1 - ini)) + ini);
    return nums[n];
  }

}

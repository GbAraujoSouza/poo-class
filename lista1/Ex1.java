import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Float> notas = new ArrayList<Float>();

    int qntNotas = 0;
    float nota;
    System.out.println("Digita as notas dos alunos para calcular a media: (-1 para parar)");
    int indiceNota = 1;
    do {
      System.out.printf("n[%d]: ", indiceNota++);
      nota = sc.nextFloat();
      sc.nextLine();
      notas.add(nota);
      qntNotas++;
    } while (nota != -1);
    notas.remove(notas.size() - 1);
    qntNotas--;
    
    float somaMedias = 0;
    int i = 0;
    while (i < notas.size()) {
      somaMedias += notas.get(i);
      i++;
    }
    float media = somaMedias / qntNotas;
    System.out.println(media);
  }
}

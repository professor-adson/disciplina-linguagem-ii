package revisao;

import java.util.Scanner;

public class Teste4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int x = 10;
    try {
      System.out.println("Digite o denominador:");
      int y = s.nextInt();
      double z = x / y;
    } catch (Exception e) {
      System.out.println("Erro");
    }
    System.out.println("Fim");
  }
}

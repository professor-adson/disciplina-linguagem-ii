package aula4;

import java.util.Scanner;

public class Recursivo3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite x: ");
    int x = s.nextInt();
    s.nextLine();
    System.out.println("Digite k: ");
    int k = s.nextInt();

    int resultado = potencia(x, k);
    System.out.println(resultado);
  }

  static int potencia(int x, int k) {
    if (k == 0)
      return 1;
    else
      return x * potencia(x, k - 1);
  }
}

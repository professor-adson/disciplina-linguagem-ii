package aula4;

import java.util.Scanner;

public class Recursivo2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n = s.nextInt();

    float soma = somaFracaoRecursiva(n);
    System.out.println(soma);
  }

  static float somaFracaoRecursiva(float n) {
    if (n - 1 > 0) {
      return (1 / n) + somaFracaoRecursiva(n - 1);
    } else return (1 / n);
  }
}

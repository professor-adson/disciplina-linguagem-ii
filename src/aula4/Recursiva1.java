package aula4;

import java.util.Scanner;

public class Recursiva1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int n = s.nextInt();

    int soma = somaRecursiva(n);
    System.out.println(soma);
  }

  static int somaRecursiva(int n) {
    if (n - 1 > 0) {
      return n + somaRecursiva(n - 1);
    } else return n;
  }
}

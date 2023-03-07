package aula7;

import java.util.Scanner;

public class Testes {
  public static void main(String[] args) {
    AlunoIntegrado a1 = new AlunoIntegrado("João", "11 1111 1111");

    Scanner s = new Scanner(System.in);

    boolean continua = true;
    while (continua) {
      int index = getIndex(s, a1.getNotas());
      double nota = getNota(s);

      a1.setNota(index, nota);
      System.out.println("nota " + index + "= " + a1.getNotas()[index]);

      System.out.println("Continua?");
      continua = s.nextBoolean();
    }
    System.out.println("média " + a1.calcularMedia());
  }

  public static int getIndex(Scanner s, double[] notas) {
    try {
      System.out.println("Digite o índice da nota:");
      int index = s.nextInt();

      if (index < 0 || index >= notas.length) {
        throw new Exception("Índice inválido");
      }
      return index;
    } catch (Exception e) {
      return getIndex(s, notas);
    }
  }

  public static double getNota(Scanner s) {
    try {
      System.out.println("Digite a nota:");
      double nota = s.nextDouble();

      if (nota < 0) {
        throw new Exception("Nota negativa");
      }
      return nota;
    } catch (Exception e) {
      return getNota(s);
    }
  }
}
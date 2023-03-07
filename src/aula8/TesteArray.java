package aula8;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteArray {
  public static void main(String[] args) {
    int[] array = new int[10];

    try {
      Scanner s = new Scanner(System.in);
      System.out.println("Digite um valor");
      int input = s.nextInt();
      int index = 0;

      while (input != 0) {
        if (index > 9) {
          throw new IndexOutOfBoundsException("Excedeu o limite");
        }
        array[index] = input;

        System.out.println("Digite um valor");
        input = s.nextInt();
        index++;
      }
      System.out.println(Arrays.toString(array));
    } catch (IndexOutOfBoundsException iobe) {
      System.out.println("Fora dos limites");
      iobe.printStackTrace();
    } catch (InputMismatchException ime) {
      System.out.println("Valor não numérico");
    }
  }

  public static void doSomething() {
    System.out.println("hello");
  }
}
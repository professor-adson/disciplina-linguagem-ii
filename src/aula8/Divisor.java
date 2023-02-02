package aula8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Digite o numerador:");
            int n1 = s.nextInt();

            System.out.println("Digite o denominador:");
            int n2 = s.nextInt();

            System.out.println(n1/n2);

        } catch (ArithmeticException ae) {
            System.out.println("Divisão por zero");
        } catch (InputMismatchException ime) {
            System.out.println("Valor não numérico");
        }
    }
}

package aula9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteMeses {
    public static void main(String[] args) {
        String[] meses = new String[12];

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite o índice do mês");
            int input = s.nextInt();

            while (input != 0) {
                if (input > 11) {
                    throw new IndexOutOfBoundsException("Excedeu o limite");
                }
                System.out.println(meses[input]);
            }
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Fora dos limites");
            iobe.printStackTrace();
        } catch (InputMismatchException ime) {
            System.out.println("Valor não numérico");
        }
    }
}

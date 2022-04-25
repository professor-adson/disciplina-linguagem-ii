package revisao;

import java.util.InputMismatchException;

public class Teste2 {
    public static void main(String[] args) {
        try {
            int[] r = y(4);
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] y(int a) throws Exception {
        int[] x = new int[3];
        x[a] = 10;
        return x;
    }
}

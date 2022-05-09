package aula13;

import java.util.ArrayList;
import java.util.Collection;

public class TestePerformance {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto:	" + tempo);
    }
}

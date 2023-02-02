package aula9;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Crie uma nova conta corrente. Digite o valor do limite:");
        float limite = s.nextFloat();
        System.out.println("Digite o saldo inicial:");
        float saldo = s.nextFloat();

        ContaCorrente cc = new ContaCorrente(limite, saldo);
        try {
            float saque, deposito;
            System.out.println("Realize um saque de :");
            saque = s.nextFloat();
            cc.sacar(saque);

            System.out.println("Realize um depósito de :");
            deposito = s.nextFloat();
            cc.depositar(deposito);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

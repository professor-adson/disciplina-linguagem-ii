package aula3;

public class Testes {
    public static void main(String[] args) {
        Gerente g = new Gerente("G1", "001", 100);
        Assistente a = new Assistente("A1", "002", 20);
        Vendedor v = new Vendedor("V1", "003", 50, 10);

        double soma = g.calculaSalario() + a.calculaSalario() + v.calculaSalario();
        System.out.println(soma);
    }
}

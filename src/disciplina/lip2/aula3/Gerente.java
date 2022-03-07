package disciplina.lip2.aula3;

public class Gerente extends Funcionario {
    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return this.getSalarioBase() * 2;
    }
}

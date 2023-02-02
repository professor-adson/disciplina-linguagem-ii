package aula1;

public class Assistente extends Funcionario {
  public Assistente(String nome, String matricula, double salario_base) {
    super(nome, matricula, salario_base);
  }

  @Override
  public double calculaSalario() {
    return this.salario_base;
  }
}

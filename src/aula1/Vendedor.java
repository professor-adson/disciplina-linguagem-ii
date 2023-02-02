package aula1;

public class Vendedor extends Funcionario {

  double comissao;

  public Vendedor(String nome, String matricula, double salario_base) {
    super(nome, matricula, salario_base);
  }

  public Vendedor(String nome, String matricula, double salario_base, double comissao) {
    super(nome, matricula, salario_base);
    this.comissao = comissao;
  }

  @Override
  public double calculaSalario() {
    return this.salario_base + this.comissao;
  }
}

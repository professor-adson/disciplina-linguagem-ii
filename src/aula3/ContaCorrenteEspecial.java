package aula3;

public class ContaCorrenteEspecial extends Conta{
  @Override
  public void sacar(double quantia) {
    this.saldo = this.saldo - quantia - (0.1 / 100) * quantia;
  }
}

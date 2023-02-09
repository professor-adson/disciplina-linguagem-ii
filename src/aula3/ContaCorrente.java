package aula3;

public class ContaCorrente extends Conta {
  @Override
  public void sacar(double quantia) {
    this.saldo = this.saldo - quantia - (0.5 / 100) * quantia;
  }
}

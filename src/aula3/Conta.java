package aula3;

public abstract class Conta {
  double saldo;

  public void depositar(double quantia) {
    this.saldo += quantia;
  }
  public abstract void sacar(double quantia);

  public double obterSaldo() {
    return this.saldo;
  }
}

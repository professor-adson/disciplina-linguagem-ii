package aula9;

public class ContaCorrente {
    private float limite;
    private float saldo;

    public ContaCorrente(float limite, float saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }

    public void sacar(float valor) throws Exception{
        System.out.println("saque: "+ valor + ", saldo: "+ this.saldo + ", limite: " + this.limite);
        if (valor > saldo + limite) {
            throw new Exception("Valor sacado excede máximo do limite");
        } else if (valor > saldo){
            float faltante = valor - saldo;
            this.limite -= faltante;
        }
        this.saldo -= valor;
        System.out.println("novo saldo: " + this.saldo + ", novo limite: " + this.limite);
    }

    public void depositar(float valor) {
        System.out.println("depósito: "+ valor + ", saldo: "+ this.saldo + ", limite: " + this.limite);
        float limitePendente = 400 - this.limite;

        float restante = 0;
        if (limitePendente > 0) {
            if (valor > limitePendente) {
                restante = valor - limitePendente;
                this.limite += limitePendente;
            } else {
                this.limite += valor;
            }
        }

        this.saldo += restante;
        System.out.println("novo saldo: " + this.saldo + ", novo limite: " + this.limite);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}

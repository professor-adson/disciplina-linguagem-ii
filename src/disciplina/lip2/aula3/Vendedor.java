package disciplina.lip2.aula3;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return this.getSalarioBase() + this.comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}

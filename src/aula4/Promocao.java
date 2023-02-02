package aula4;

public class Promocao extends Mensagem{

    public Promocao() {
    }

    public Promocao(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Promoção para " + this.destinatario);
    }
}

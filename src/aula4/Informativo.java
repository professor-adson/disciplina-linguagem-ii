package aula4;

public class Informativo extends Mensagem {

    public Informativo() {
    }

    public Informativo(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Informativo para " + this.destinatario);
    }
}

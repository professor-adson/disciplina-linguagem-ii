package disciplina.lip2.aula4;

public class Urgente extends Mensagem {

    public Urgente() {
    }

    public Urgente(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Urgente para " + this.destinatario);
    }
}

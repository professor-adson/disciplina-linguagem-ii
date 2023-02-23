package aula5;

public class Urgente extends Mensagem {
  public Urgente(String destinatario) {
    super(destinatario);
  }

  @Override
  public void mostrar() {
    System.out.println("Mensagem urgente para " + this.destinatario);
  }

  @Override
  public String toString() {
    return "Urgente{" +
        "destinatario='" + this.destinatario + '\'' +
        '}';
  }
}

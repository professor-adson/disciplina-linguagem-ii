package aula5.parte2;

public class Urgente implements Mensagem {
  String destinatario = "";

  public Urgente(String destinatario) {
    this.destinatario = destinatario;
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

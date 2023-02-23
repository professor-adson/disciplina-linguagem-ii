package aula5.parte2;

public class Informativo implements Mensagem {
  String destinatario = "";

  public Informativo(String destinatario) {
    this.destinatario = destinatario;
  }

  @Override
  public void mostrar() {
    System.out.println("Informativo para " + this.destinatario);
  }

  @Override
  public String toString() {
    return "Informativo{" +
        "destinatario='" + this.destinatario + '\'' +
        '}';
  }
}

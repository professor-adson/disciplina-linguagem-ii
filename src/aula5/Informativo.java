package aula5;

public class Informativo extends Mensagem {

  public Informativo(String destinatario) {
    super(destinatario);
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

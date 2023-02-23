package aula5.parte2;

public class Promocao implements Mensagem {
  String destinatario = "";

  public Promocao(String destinatario) {
    this.destinatario = destinatario;
  }

  @Override
  public void mostrar() {
    System.out.println("Promoção para " + this.destinatario);
  }

  @Override
  public String toString() {
    return "Promocao{" +
        "destinatario='" + this.destinatario + '\'' +
        '}';
  }
}

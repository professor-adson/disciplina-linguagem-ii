package aula5;

public class Promocao extends Mensagem {
  public Promocao(String destinatario) {
    super(destinatario);
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

package aula5;

public class Teste {
  public static void main(String[] args) {
    Informativo info = new Informativo("Adson");
    Promocao promo = new Promocao("João");
    Urgente urgente = new Urgente("Pedro");

    Mensagem[] mensagens = {info, promo, urgente};
    for (int i = 0; i < mensagens.length; i++) {
      System.out.println(mensagens[i].toString());
    }
  }
}

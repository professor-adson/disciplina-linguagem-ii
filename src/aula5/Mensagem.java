package aula5;

public abstract class Mensagem {
  String destinatario;

  public Mensagem(String destinatario) {
    this.destinatario = destinatario;
  }

  public abstract void mostrar();
}

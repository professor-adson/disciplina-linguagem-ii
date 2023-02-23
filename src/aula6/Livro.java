package aula6;

public class Livro implements Comparavel {
  String nome;

  public Livro(String nome) {
    this.nome = nome;
  }

  @Override
  public int comparar(Object o) {
    Livro livro = (Livro) o;
    return this.nome.compareTo(livro.nome);
  }
}

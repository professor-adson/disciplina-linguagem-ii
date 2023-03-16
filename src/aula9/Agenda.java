package aula9;

public class Agenda {
  Pessoa[] pessoas;
  int ultimoIndice;

  public Agenda() {
    this.ultimoIndice = 0;
    this.pessoas = new Pessoa[10];
  }

  public void armazenaPessoa(String nome, int idade, float altura) throws Exception {
    if (this.ultimoIndice < 10) {
      this.pessoas[ultimoIndice] = new Pessoa(nome, idade, altura);
      this.ultimoIndice++;
    } else {
      throw new Exception("Não há espaço");
    }
  }

  public void removePessoa(String nome) {
    Pessoa[] p = new Pessoa[10];
    int indice = this.buscaPessoa(nome);
    for (int j = 0; j < p.length; j++) {
      if (j < indice) {
        p[j] = this.pessoas[j];
      } else {
        if (j + 1 < this.pessoas.length - 1) {
          p[j] = this.pessoas[j + 1];
        }
      }
    }
    this.pessoas = p;
    this.ultimoIndice--;
  }

  public int buscaPessoa(String nome) {
    int indice = this.pessoas.length;
    for (int i = 0; i < this.pessoas.length; i++) {
      Pessoa p = this.pessoas[i];
      if (p != null && p.getNome().equals(nome)) {
        indice = i;
      }
    }
    return indice;
  }

  public void imprimeAgenda() {
    for (Pessoa p: pessoas) {
      if (p != null) {
        System.out.println(p.toString());
      }
    }
  }
}
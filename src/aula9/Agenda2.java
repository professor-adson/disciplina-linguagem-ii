package aula9;

import java.util.ArrayList;

public class Agenda2 {
  ArrayList<Pessoa> pessoas;

  public Agenda2() {
    this.pessoas = new ArrayList<Pessoa>();
  }

  public void armazenaPessoa(String nome, int idade, float altura) throws Exception {
    this.pessoas.add(new Pessoa(nome, idade, altura));
  }

  public void removePessoa(String nome) {
    this.pessoas.remove(new Pessoa(nome));
  }

  public int buscaPessoa(String nome) {
    return this.pessoas.indexOf(new Pessoa(nome));
  }

  public void imprimeAgenda() {
    for (Pessoa p : pessoas) {
      if (p != null) {
        System.out.println(p.toString());
      }
    }
  }
}
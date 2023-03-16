package aula9;

import java.util.Objects;

public class Pessoa {
  private String nome;
  private int idade;
  private float altura;

  public Pessoa(String nome, int idade, float altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", altura=" + altura +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Pessoa)) return false;
    Pessoa pessoa = (Pessoa) o;
    return Objects.equals(nome, pessoa.nome);
  }
}
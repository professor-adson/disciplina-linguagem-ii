package aula9;

public class Cliente {
  int id;
  String nome;
  int idade;
  String telefone;

  public Cliente(int id, String nome, int idade, String telefone) {
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "id=" + id +
        ", nome='" + nome + '\'' +
        ", idade=" + idade +
        ", telefone='" + telefone + '\'' +
        '}';
  }
}
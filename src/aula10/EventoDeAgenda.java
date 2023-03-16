package aula10;

import java.util.Objects;

public class EventoDeAgenda {
  String codigo;
  String nome;
  Data data;

  public EventoDeAgenda(String codigo, String nome, Data data) {
    this.codigo = codigo;
    this.nome = nome;
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EventoDeAgenda)) return false;
    EventoDeAgenda that = (EventoDeAgenda) o;
    return codigo.equals(that.codigo) && nome.equals(that.nome) && data.equals(that.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, nome, data);
  }

  @Override
  public String toString() {
    return "EventoDeAgenda{" +
        "codigo='" + codigo + '\'' +
        ", nome='" + nome + '\'' +
        ", data=" + data.toString() +
        '}';
  }
}

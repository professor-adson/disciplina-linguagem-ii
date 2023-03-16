package aula9;

public class TesteAgenda {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    try {
      agenda.armazenaPessoa("P1", 10, 1.5f);
      agenda.armazenaPessoa("P2", 12, 1.6f);
      agenda.armazenaPessoa("P3", 14, 1.7f);
      agenda.armazenaPessoa("P4", 15, 1.75f);

      agenda.imprimeAgenda();
      System.out.println("---");
      agenda.removePessoa("P2");
      agenda.imprimeAgenda();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
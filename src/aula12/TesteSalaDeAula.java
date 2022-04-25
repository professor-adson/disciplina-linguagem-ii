package aula12;

public class TesteSalaDeAula {
    public static void main(String[] args) {
        SalaDeAula salaDeAula = new SalaDeAula();
        Aluno aluno = new Aluno("Adson", "1");

        salaDeAula.matricular(aluno);
        salaDeAula.buscar("Adson");
        salaDeAula.imprimir();
    }
}

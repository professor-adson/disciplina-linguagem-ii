package aula12;

import java.util.HashMap;

public class SalaDeAula {
    private HashMap<String, Aluno> alunos;

    public SalaDeAula() {
        this.alunos = new HashMap<>();
    }

    public void matricular(Aluno aluno) {
        this.alunos.put(aluno.getMatricula(), aluno);
    }

    public Aluno buscar(String matricula) {
        return this.alunos.get(matricula);
    }

    public void imprimir() {
        for (String matricula : alunos.keySet()) {
            System.out.println(alunos.get(matricula).toString());
        }
    }
}

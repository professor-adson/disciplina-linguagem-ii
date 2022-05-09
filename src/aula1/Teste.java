package aula1;

import java.util.ArrayList;

class Pato {
    private String nome;

    Pato(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        ArrayList<Pato> patos = new ArrayList<>();
//        Pato donald = new Pato(); patos.add(donald);
//        Pato pato = new Pato("Donald"); patos.add(donald);
        patos.add(new Pato("Donald"));
//        patos.add(new Donald());
    }
}


    
package disciplina.lip2.interfaces;

public class Testes {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.acelerar();
        c1.frear();
        c1.abrePorta(1);

        Moto m = new Moto();
        m.acelerar();
        m.frear();
    }
}

package disciplina.lip2.aula2;

public class Moto implements Automovel{
    @Override
    public void acelerar() {
        System.out.println("moto acelerou");
    }

    @Override
    public void frear() {
        System.out.println("moto freiou");
    }
}

package disciplina.lip2.interfaces;

public class Carro implements Automovel {
    @Override
    public void acelerar() {
        System.out.println("carro acelerou");
    }

    @Override
    public void frear() {
        System.out.println("carro freiou");
    }

    public void abrePorta(int x){
        System.out.println("abriu a porta " + x);
    }
}

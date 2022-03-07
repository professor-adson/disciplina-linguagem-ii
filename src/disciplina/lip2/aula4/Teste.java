package disciplina.lip2.aula4;

public class Teste {
    public static void main(String[] args) {
        Mensagem[] mensagens = new Mensagem[3];
        mensagens[0] = new Informativo("Adson");
        mensagens[1] = new Promocao("José");
        mensagens[2] = new Urgente("João");

        for (Mensagem m: mensagens) {
            m.mostrar();
        }
    }
}

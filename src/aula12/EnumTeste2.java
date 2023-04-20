package aula12;

public class EnumTeste2 {
  public enum EstacoesDoAno {
    PRIMAVERA(1, 2),
    VERAO(2, 3),
    OUTONO(3, 4),
    INVERNO(4, 5);

    private int x;
    private int y;

    EstacoesDoAno(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
  }

  public static void main(String[] args) {
    for (EnumTeste2.EstacoesDoAno estacao : EnumTeste2.EstacoesDoAno.values()) {
      System.out.println(estacao.getX());
    }
  }
}

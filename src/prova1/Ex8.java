package prova1;

public class Ex8 {
  public static void main(String[] args) {
    try {
      System.out.println("A");
      f();
      System.out.println("B");
    } catch (Exception ex) {
      System.out.println("C");
    } finally {
      System.out.println("D");
    }
  }

  public static void f() throws Exception {
    throw new Exception();
  }

}

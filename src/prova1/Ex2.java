package prova1;

class Ex2 {
  public static void main(String[] args) {
    System.out.println(f(1));
  }
  static Exception f(int i) {
    if (i > 0) {
      return new Exception("0");
    } else {
      throw new RuntimeException("1");
    }
  }
}



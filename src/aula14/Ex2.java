package aula14;

import java.util.HashSet;

public class Ex2 {
  public static void main(String[] args) {
    HashSet<String> hs1 = new HashSet<>();
    HashSet<String> hs2 = new HashSet<>();

    hs1.add("Goiânia");
    hs1.add("Abadia");
    hs1.add("Trindade");

    hs2.add("Goiânia");
    hs2.add("Abadia");

    int count = 0;
    for (String x: hs1) {
      if (hs2.contains(x)) {
        count++;
      }
    }

    System.out.println(count);
  }
}

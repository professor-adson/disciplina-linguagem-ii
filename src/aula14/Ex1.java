package aula14;

import java.util.Arrays;
import java.util.HashSet;

public class Ex1 {
  public static void main(String[] args) {
    HashSet<String> x = new HashSet<>();

    x.add("Goiânia");
    x.add("Goiânia");
    x.add("Trindade");

    System.out.println(Arrays.toString(x.toArray()));
  }
}

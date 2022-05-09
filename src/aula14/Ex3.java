package aula14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Ex3 {
  public static void main(String[] args) {
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < 10; i++) {
      hashMap.put("CHAVE"+i, i);
    }

    HashSet<Integer> r = hashMapToHashSet(hashMap);
    System.out.println(Arrays.toString(r.toArray()));
  }

  static HashSet<Integer> hashMapToHashSet(HashMap<String, Integer> hashMap) {
    HashSet<Integer> result = new HashSet<>();
    for (Integer v: hashMap.values()) {
      result.add(v);
    }
    return result;
  }
}

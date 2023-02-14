package aula4;

import java.util.Arrays;

public class Recursivo4 {
  public static void main(String[] args) {
    int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    inverte(nums, 0, 9);
    System.out.println(Arrays.toString(nums));
  }

  public static void inverte(int v[], int esq, int dir) {
    int t;
    if (esq >= dir) return;
    t = v[esq];
    v[esq] = v[dir];
    v[dir] = t;
    inverte(v, esq + 1, dir - 1);
  }
}

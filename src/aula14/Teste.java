package aula14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Teste {
  public static void main(String[] args) {
    try {
      Object carro = Class.forName("aula14.Carro").getDeclaredConstructor().newInstance();
      System.out.println("Atributos: ------------------");
      for (Field f : carro.getClass().getDeclaredFields()) {
        System.out.println(f.getName());
      }
      System.out.println("Métodos: ------------------");
      for (Method m : carro.getClass().getMethods()) {
        System.out.println(m.getName());
      }
      System.out.println("Invoke: ------------------");
      Method acelerar = Class.forName("aula14.Carro").getDeclaredMethod("acelerar", int.class);
      acelerar.invoke(carro, 100);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

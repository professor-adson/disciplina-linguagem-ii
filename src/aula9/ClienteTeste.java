package aula9;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteTeste {
  public static void main(String[] args) {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    Scanner s = new Scanner(System.in);

    System.out.println("Digite o id:");
    int id = s.nextInt();
    while (id > 0) {
      System.out.println("Digite a idade:");
      int idade = s.nextInt();
      s.nextLine();
      System.out.println("Digite o nome:");
      String nome = s.nextLine();
      System.out.println("Digite o telefone:");
      String telefone = s.nextLine();

      Cliente c = new Cliente(id, nome, idade, telefone);
      clientes.add(c);

      System.out.println("Digite o id:");
      id = s.nextInt();
    }
    for (Cliente c: clientes) {
      System.out.println(c.toString());
    }
  }
}

package aula6;

public class Teste {
  public static void main(String[] args) {
    Livro[] livros = new Livro[4];
    livros[0] = new Livro("Almoçando com Java");
    livros[1] = new Livro("Classes Java em fila indiana");
    livros[2] = new Livro("Java em todo lugar");
    livros[3] = new Livro("Viajando no Java");

    ordenar(livros);

    for(int cont = 0; cont < livros.length; cont++) {
      System.out.println(livros[cont].nome);
      System.out.println("--------");
    }
  }

  public static void ordenar(Comparavel[] objetos) {
    for (int i = 0; i < objetos.length; i++) {
      for (int j = i + 1; j < objetos.length; j++) {
        if (objetos[i].comparar(objetos[j]) > 0) { /* Verifica se os objetos não estão na ordem. */
          Comparavel temp = objetos[i]; /* Troca os objetos de lugar no vetor. */
          objetos[i] = objetos[j];
          objetos[j] = temp;
        }
      }
    }
  }
}

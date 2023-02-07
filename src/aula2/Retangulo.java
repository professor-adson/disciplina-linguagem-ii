package aula2;

public class Retangulo extends FormaGeometrica {
  int base;
  int altura;

  public Retangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double calcularArea() {
    return this.base * this.altura;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * (this.base + this.altura);
  }
}

package aula2;

public class Circulo extends FormaGeometrica {
  int raio;

  public Circulo(int raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * Math.pow(raio, 2);
  }

  @Override
  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
}

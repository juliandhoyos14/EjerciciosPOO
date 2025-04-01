package org.solid.srp.figura.correcto;

public class Rectangulo implements Poligono {

  private double base;
  private double altura;

  public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double getSumaAngulos() {
    return 360;
  }

  @Override
  public double getDiagonal() {
    return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
  }

  @Override
  public double getPerimetro() {
    return 2 * (base + altura);
  }
}

package org.solid.lsp.figura.correcto;

public class Rectangulo {

  private double base;
  private double altura;

  public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public double calcularArea() {
    return base * altura;
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }
}

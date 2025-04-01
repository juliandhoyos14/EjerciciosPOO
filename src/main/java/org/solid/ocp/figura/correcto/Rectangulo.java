package org.solid.ocp.figura.correcto;

public class Rectangulo extends Figura {

  private double base;
  private double altura;

  public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double getArea() {
    return base * altura;
  }
}

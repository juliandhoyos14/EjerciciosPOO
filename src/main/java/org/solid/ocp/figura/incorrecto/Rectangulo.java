package org.solid.ocp.figura.incorrecto;

public class Rectangulo extends Figura {

  private double base;
  private double altura;

  public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }
}

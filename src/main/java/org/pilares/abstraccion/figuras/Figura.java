package org.pilares.abstraccion.figuras;

public abstract class Figura {

  protected double area;

  public abstract void calcularArea();

  public double getArea() {
    return area;
  }
}

package org.pilares.abstraccion.figurasgeometricas;

public abstract class Figura {

  protected double area;

  public abstract void calcularArea();

  public double getArea() {
    return area;
  }
}

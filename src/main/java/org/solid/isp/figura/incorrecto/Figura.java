package org.solid.isp.figura.incorrecto;

public abstract class Figura {

  private int dimension;

  public Figura(int dimension) {
    this.dimension = dimension;
  }

  public abstract double getLongitud();

  public abstract double getArea();

  public abstract double getVolumen();

  public int getDimension() {
    return dimension;
  }
}

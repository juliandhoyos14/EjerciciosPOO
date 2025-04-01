package org.solid.isp.figura.correcto;

public abstract class Figura1D implements Propiedades1D {

  private final int dimension;

  public Figura1D() {
    this.dimension = 1;
  }

  public int getDimension() {
    return dimension;
  }
}

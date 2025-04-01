package org.solid.isp.figura.correcto;

public abstract class Figura2D implements Propiedades1D, Propiedades2D {

  private final int dimension;

  public Figura2D() {
    this.dimension = 2;
  }

  public int getDimension() {
    return dimension;
  }
}

package org.solid.isp.figura.correcto;

public abstract class Figura3D implements Propiedades1D, Propiedades2D, Propiedades3D {

  private final int dimension;

  public Figura3D() {
    this.dimension = 3;
  }

  public int getDimension() {
    return dimension;
  }
}

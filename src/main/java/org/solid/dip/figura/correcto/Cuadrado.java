package org.solid.dip.figura.correcto;

public class Cuadrado implements Figura {

  private double lado;

  public Cuadrado(double lado) {
      this.lado = lado;
  }

  @Override
  public double getArea() {
      return Math.pow(lado, 2);
  }
}

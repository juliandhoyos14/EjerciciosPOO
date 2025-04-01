package org.solid.dip.figura.incorrecto;

public class Cuadrado {

  private double lado;

  public Cuadrado(double lado) {
      this.lado = lado;
  }

  public double getArea() {
      return Math.pow(lado, 2);
  }
}

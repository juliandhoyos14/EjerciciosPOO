package org.solid.ocp.figura.incorrecto;

public class Circulo extends Figura {

  private double radio;

  public Circulo(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }
}

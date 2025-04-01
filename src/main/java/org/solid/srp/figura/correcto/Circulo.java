package org.solid.srp.figura.correcto;

public class Circulo implements Figura {

  private double radio;

  public Circulo(double radio) {
      this.radio = radio;
  }

  @Override
  public double getPerimetro() {
    return 2 * Math.PI * radio;
  }
}

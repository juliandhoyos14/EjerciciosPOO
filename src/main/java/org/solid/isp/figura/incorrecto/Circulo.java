package org.solid.isp.figura.incorrecto;

public class Circulo extends Figura {

  private double radio;

  public Circulo(double radio) {
    super(2);
    this.radio = radio;
  }

  @Override
  public double getLongitud() {
    return 2 * Math.PI * radio;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radio, 2);
  }

  @Override
  public double getVolumen() {
    throw new UnsupportedOperationException("El círculo no tiene volumen");
  }
}

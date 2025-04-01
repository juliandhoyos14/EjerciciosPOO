package org.solid.isp.figura.correcto;

public class Circunferencia extends Figura1D {

  private double radio;

  public Circunferencia(double radio) {
    this.radio = radio;
  }

  @Override
  public double getLongitud() {
    return 2 * Math.PI * radio;
  }
}

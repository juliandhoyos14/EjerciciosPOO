package org.solid.isp.figura.incorrecto;

public class Circunferencia extends Figura {

  private double radio;

  public Circunferencia(double radio) {
    super(1);
    this.radio = radio;
  }

  @Override
  public double getLongitud() {
    return 2 * Math.PI * radio;
  }

  @Override
  public double getArea() {
    throw new UnsupportedOperationException("La circunferencia no tiene área");
  }

  @Override
  public double getVolumen() {
    throw new UnsupportedOperationException("La circunferencia no tiene volumen");
  }
}

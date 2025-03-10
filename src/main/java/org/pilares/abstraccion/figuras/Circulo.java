package org.pilares.abstraccion.figuras;

public class Circulo extends Figura {

  double radio;

  @Override
  public void calcularArea() {
    area = Math.PI * radio * radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }
}

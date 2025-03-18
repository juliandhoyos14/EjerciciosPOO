package org.pilares.abstraccion.figurasgeometricas;

public class Circulo extends Figura {

  private int radio;

  public Circulo(int radio) {
    this.radio = radio;
  }

  @Override
  public void calcularArea() {
    area = Math.PI * Math.pow(radio, 2);
  }
}

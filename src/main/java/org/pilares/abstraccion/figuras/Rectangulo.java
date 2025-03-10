package org.pilares.abstraccion.figuras;

public class Rectangulo extends Figura {

  int base;
  int altura;

  @Override
  public void calcularArea() {
    area = base * altura;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }
}

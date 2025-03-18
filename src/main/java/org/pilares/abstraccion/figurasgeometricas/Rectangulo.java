package org.pilares.abstraccion.figurasgeometricas;

public class Rectangulo extends Figura {

  private int base;
  private int altura;

  public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
  }

  @Override
  public void calcularArea() {
    area = base * altura;
  }
}

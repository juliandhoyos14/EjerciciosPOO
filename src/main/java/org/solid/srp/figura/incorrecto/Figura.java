package org.solid.srp.figura.incorrecto;

public class Figura {

  private TipoFigura tipo;
  private double base;
  private double altura;
  private double radio;

  public Figura(double base, double altura) {
    this.tipo = TipoFigura.RECTANGULO;
    this.base = base;
    this.altura = altura;
  }

  public Figura(double radio) {
    this.tipo = TipoFigura.CIRCULO;
    this.radio = radio;
  }

  public double getPerimetro() {
    switch (tipo) {
      case RECTANGULO:
        return 2 * (base + altura);
      case CIRCULO:
        return 2 * Math.PI * radio;
      default:
        throw new UnsupportedOperationException("Tipo de figura no soportado: " + tipo);
    }
  }

  public double getSumaAngulos() {
    switch (tipo) {
      case RECTANGULO:
        return 360;
      default:
        throw new UnsupportedOperationException("Tipo de figura no soportado: " + tipo);
    }
  }

  public double getDiagonal() {
    switch (tipo) {
      case RECTANGULO:
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
      default:
        throw new UnsupportedOperationException("Tipo de figura no soportado: " + tipo);
    }
  }
}

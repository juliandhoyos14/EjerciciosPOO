package org.solid.lsp.figura.correcto;

public class Cuadrado extends Rectangulo {

  public Cuadrado(double lado) {
    super(lado, lado);
  }

  public double getLado() {
    return super.getAltura();
  }
}

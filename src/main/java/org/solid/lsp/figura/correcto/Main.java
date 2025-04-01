package org.solid.lsp.figura.correcto;

public class Main {

  public static void main(String[] args) {
    Rectangulo rectangulo = new Rectangulo(4, 5);
    Rectangulo cuadrado = new Cuadrado(5);

    System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
  }
}

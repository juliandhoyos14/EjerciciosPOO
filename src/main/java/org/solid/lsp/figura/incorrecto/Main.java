package org.solid.lsp.figura.incorrecto;

public class Main {

  public static void main(String[] args) {
    Rectangulo rectangulo = new Rectangulo(4, 5);
    Rectangulo cuadrado = new Cuadrado(5);
    cuadrado.setAltura(10); // Esto no debería ser posible

    System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
  }
}

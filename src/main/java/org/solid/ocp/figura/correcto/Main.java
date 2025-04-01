package org.solid.ocp.figura.correcto;

public class Main {

  public static void main(String[] args) {
    Figura circulo = new Circulo(5);
    Figura rectangulo = new Rectangulo(10, 5);

    System.out.println("Área del círculo: " + circulo.getArea());
    System.out.println("Área del rectángulo: " + rectangulo.getArea());
  }
}

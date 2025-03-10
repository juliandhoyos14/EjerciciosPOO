package org.pilares.abstraccion.figuras;

public class Main {

  public static void main(String[] args) {
    Circulo circulo = new Circulo();
    circulo.setRadio(10);
    circulo.calcularArea();
    System.out.println("El area del circulo es: " + circulo.getArea());

    Rectangulo rectangulo = new Rectangulo();
    rectangulo.setBase(5);
    rectangulo.setAltura(4);
    rectangulo.calcularArea();
    System.out.println("El area del rectangulo es: " + rectangulo.getArea());
  }
}

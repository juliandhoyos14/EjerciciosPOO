package org.pilares.abstraccion.figurasgeometricas;

public class Main {

  public static void main(String[] args) {
    Figura figura = new Circulo(6);
    Figura figura2 = new Rectangulo(5, 10);

    figura.calcularArea();
    System.out.println("El área del círculo es: " + figura.getArea());
    figura2.calcularArea();
    System.out.println("El área del rectángulo es: "+ figura2.getArea());
  }
}

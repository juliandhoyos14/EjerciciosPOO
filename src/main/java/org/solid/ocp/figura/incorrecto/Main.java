package org.solid.ocp.figura.incorrecto;

public class Main {

  public static void main(String[] args) {
    Figura rectangulo = new Rectangulo(10, 5);
    Figura circulo = new Circulo(5);

    UtilidadArea utilidadArea = new UtilidadArea();
    double areaRectangulo = utilidadArea.calcularArea(rectangulo);
    double areaCirculo = utilidadArea.calcularArea(circulo);

    System.out.println("Área del rectángulo: " + areaRectangulo);
    System.out.println("Área del círculo: " + areaCirculo);
  }
}

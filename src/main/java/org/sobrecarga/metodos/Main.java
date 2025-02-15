package org.sobrecarga.metodos;

public class Main {

  public static void main(String[] args) {
    int areaCuadrado = CalculadoraDeArea.calcularArea(5);
    int areaRectangulo = CalculadoraDeArea.calcularArea(5, 10);
    double areaCirculo = CalculadoraDeArea.calcularArea(5.0);

    System.out.println("El área del cuadrado es: " + areaCuadrado);
    System.out.println("El área del rectángulo es: " + areaRectangulo);
    System.out.println("El área del círculo es: " + areaCirculo);
  }
}

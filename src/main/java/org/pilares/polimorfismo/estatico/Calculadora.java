package org.pilares.polimorfismo.estatico;

public class Calculadora {

  public int sumar(int a, int b) {
    return a + b;
  }

  // Sobrecarga del método sumar: ahora suma tres números
  public int sumar(int a, int b, int c) {
    return a + b + c;
  }

  // Sobrecarga del método sumar: ahora acepta números decimales
  public double sumar(double a, double b) {
    return a + b;
  }
}

package org.practicas.kiss;

public class CalculadoraSimple {

  public static int sumar(int a, int b) {
    return a + b;
  }

  public static int restar(int a, int b) {
    return a - b;
  }

  public static int multiplicar(int a, int b) {
    return a * b;
  }

  public static double dividir(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero");
    }
    return (double) a / b;
  }
}

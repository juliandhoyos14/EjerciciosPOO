package org.practicas.kiss;

public class Calculadora {

  public static int sumar(int a, int b) {
    return a + b;
  }

  public static int restar(int a, int b) {
    return a - b;
  }

  public static int multiplicar(int a, int b) {
    int operadorSigno = (a > 0 && b > 0) || (a < 0 && b < 0) ? 1 : -1;

    int resultado = 0;
    for (int i = 0; i < Math.abs(b); i++) {
      resultado += Math.abs(a);
    }
    return operadorSigno * resultado;
  }

  public static double dividir(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("No se puede dividir por cero");
    }
    int operadorSigno = (a > 0 && b > 0) || (a < 0 && b < 0) ? 1 : -1;

    int dividendo = Math.abs(a);
    int divisor = Math.abs(b);
    int resultado = 0;

    while (dividendo >= divisor) {
      dividendo -= divisor;
      resultado++;
    }
    return (double) operadorSigno * resultado;
  }
}

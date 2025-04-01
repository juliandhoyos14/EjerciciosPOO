package org.practicas.dry.dryprocesodllo;

public class UtilidadCombinatoria {

  public static int coeficienteBinomial(int n, int k) {
    if (k < 0 || k > n) {
      throw new IllegalArgumentException("El valor de k debe ser mayor o igual a 0 y menor o igual a n");
    }
    return factorial(n) / (factorial(k) * factorial(n - k));
  }

  public static int factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("El número debe ser positivo");
    }
    int resultado = 1;
    for (int i = 2; i <= n; i++) {
      resultado *= i;
    }
    return resultado;
  }
}

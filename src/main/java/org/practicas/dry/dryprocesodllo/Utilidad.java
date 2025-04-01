package org.practicas.dry.dryprocesodllo;

public class Utilidad {

  public static int factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("El número debe ser positivo");
    }
    if (n == 0 || n == 1) {
      return 1;
    } else  {
      return n * factorial(n - 1);
    }
  }
}

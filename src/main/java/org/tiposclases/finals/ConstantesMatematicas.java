package org.tiposclases.finals;

public final class ConstantesMatematicas {

  // Constantes matemáticas
  public static final double PI = 3.141592653589793;
  public static final double E = 2.718281828459045;

  // Constructor privado para evitar instanciación
  private ConstantesMatematicas() {
    throw new UnsupportedOperationException("Esta es una clase de utilidad y no puede ser instanciada.");
  }

  // Método estático para calcular el área de un círculo
  public static double calcularAreaCirculo(double radio) {
    return PI * radio * radio;
  }

  // Método estático para calcular la potencia de un número
  public static double calcularPotencia(double base, double exponente) {
    return Math.pow(base, exponente);
  }
}

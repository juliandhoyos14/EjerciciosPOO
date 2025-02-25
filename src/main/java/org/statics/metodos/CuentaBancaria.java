package org.statics.metodos;

public class CuentaBancaria {

  private String titular;
  private double saldo;

  // Atributo estático
  private static double tasaInteres = 3.5;

  public CuentaBancaria(String titular, double saldo) {
    this.titular = titular;
    this.saldo = saldo;
  }

  public void mostrarDatos() {
    System.out.println("Titular: " + titular + ", Saldo: " + saldo);
  }

  // Método estático
  public static void actualizarTasaInteres(double nuevaTasa) {
    tasaInteres = nuevaTasa;
  }

  /**
   * Método estático para obtener la tasa de interés.
   * @return la tasa de interés.
   */
  public static double obtenerTasaInteres() {
    return tasaInteres;
  }
}

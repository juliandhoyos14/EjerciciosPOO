package org.statics.metodos;

public class Main {

  public static void main(String[] args) {
    CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", 1000);
    CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", 2000);

    cuenta1.mostrarDatos();
    cuenta2.mostrarDatos();

    System.out.println("Tasa de interés actual: " + CuentaBancaria.obtenerTasaInteres());

    // Actualizar la tasa de interés
    CuentaBancaria.actualizarTasaInteres(4.0);

    // Obtener la tasa de interés
    double tasaInteres = CuentaBancaria.obtenerTasaInteres();
    System.out.println("La tasa de interés es: " + tasaInteres);
  }
}

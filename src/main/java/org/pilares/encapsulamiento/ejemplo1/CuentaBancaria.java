package org.pilares.encapsulamiento.ejemplo1;

public class CuentaBancaria {

  private double saldo;  // Atributo privado

  // Constructor
  public CuentaBancaria(double saldoInicial) {
    this.saldo = saldoInicial;
  }

  // Método para depositar dinero
  public void depositar(double cantidad) {
    if (cantidad > 0) {
      saldo += cantidad;
      System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
    } else {
      System.out.println("Cantidad no válida.");
    }
  }

  // Método para retirar dinero
  public void retirar(double cantidad) {
    if (cantidad > 0 && cantidad <= saldo) {
      saldo -= cantidad;
      System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    } else {
      System.out.println("Fondos insuficientes o cantidad inválida.");
    }
  }

  // Getter para obtener el saldo (pero no modificarlo)
  public double getSaldo() {
    return saldo;
  }
}

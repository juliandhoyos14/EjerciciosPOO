package org.pilares.encapsulamiento.ejemplo1;

public class Main {

  public static void main(String[] args) {
    CuentaBancaria cuenta = new CuentaBancaria(500);

    cuenta.depositar(200);
    cuenta.retirar(100);
    System.out.println("Saldo final: $" + cuenta.getSaldo());
  }
}

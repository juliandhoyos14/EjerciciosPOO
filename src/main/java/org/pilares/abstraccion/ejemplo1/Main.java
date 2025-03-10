package org.pilares.abstraccion.ejemplo1;

public class Main {

  public static void main(String[] args) {
    CuentaAhorros cuenta = new CuentaAhorros(1000, 123456789, "Ahorro");
    cuenta.retirar(500);
    System.out.println("tipo cuenta: " + cuenta.getTipoCuenta() + " cuenta: " + cuenta.getNumeroCuenta() + " - saldo: " + cuenta.getSaldo());
  }
}

package org.pilares.abstraccion.ejemplo1;

public class CuentaAhorros extends CuentaBancaria {

  public CuentaAhorros(double saldoInicial, long numeroCuenta, String tipoCuenta) {
    super(saldoInicial, numeroCuenta, tipoCuenta);
  }

  @Override
  public void retirar(double monto) {
    if (monto > 0 && monto <= getSaldo()) {
      double nuevoSaldo = getSaldo() - monto;
      setSaldo(nuevoSaldo);
      System.out.println("Retiro exitoso. Nuevo saldo: " + getSaldo());
    } else {
      System.out.println("Fondos insuficientes o monto inválido.");
    }
  }
}

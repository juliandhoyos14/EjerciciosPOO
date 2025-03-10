package org.pilares.abstraccion.ejemplo1;

public abstract class CuentaBancaria {

  private double saldo;
  private long numeroCuenta;
  private String tipoCuenta;

  public CuentaBancaria(double saldoInicial, long numeroCuenta, String tipoCuenta) {
      this.saldo = saldoInicial;
      this.numeroCuenta = numeroCuenta;
      this.tipoCuenta = tipoCuenta;
  }

  public abstract void retirar(double monto);

  public double getSaldo() {
      return saldo;
  }

  public long getNumeroCuenta() {
      return numeroCuenta;
  }

  public String getTipoCuenta() {
    return tipoCuenta;
  }

  public void setSaldo(double saldo) {
      this.saldo = saldo;
  }
}

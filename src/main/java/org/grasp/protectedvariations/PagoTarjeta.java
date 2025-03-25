package org.grasp.protectedvariations;

public class PagoTarjeta extends MetodoPago {

  @Override
  public void realizarPago(double monto) {
    System.out.println("Pago realizado con tarjeta: " + monto);
  }
}

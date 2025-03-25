package org.grasp.protectedvariations;

public class PagoPayPal extends MetodoPago {

  @Override
  public void realizarPago(double monto) {
    System.out.println("Pago realizado con PayPal: " + monto);
  }
}

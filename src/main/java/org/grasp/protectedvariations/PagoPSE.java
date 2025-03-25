package org.grasp.protectedvariations;

public class PagoPSE extends MetodoPago {

  @Override
  public void realizarPago(double monto) {
    System.out.println("Pago realizado con PSE: " + monto);
  }
}

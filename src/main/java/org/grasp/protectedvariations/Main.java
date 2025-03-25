package org.grasp.protectedvariations;

public class Main {

  public static void main(String[] args) {
    MetodoPago tarjeta = new PagoTarjeta();
    MetodoPago paypal = new PagoPayPal();
    MetodoPago pse = new PagoPSE();

    tarjeta.realizarPago(1000);
    paypal.realizarPago(2000);
    pse.realizarPago(3000);
  }
}

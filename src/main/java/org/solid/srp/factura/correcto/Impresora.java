package org.solid.srp.factura.correcto;

public class Impresora {

  public void imprimir(Factura factura) {
    System.out.println("Imprimiendo factura: " + factura.getContenido());
  }
}

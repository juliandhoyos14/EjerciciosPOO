package org.solid.srp.factura.incorrecto;

public class Main {

  public static void main(String[] args) {
    Factura factura = new Factura("Contenido de la factura");
    factura.imprimir();
    factura.exportarPdf();
    factura.exportarTextoPlano();
    factura.exportarXls();
  }
}

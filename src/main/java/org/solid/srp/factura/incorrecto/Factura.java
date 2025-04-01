package org.solid.srp.factura.incorrecto;

public class Factura {

  private String contenido;

  public Factura(String contenido) {
    this.contenido = contenido;
  }

  public void imprimir() {
    System.out.println("ImprimeFactura: " + contenido);
  }

  public void exportarPdf() {
    System.out.println("ExportarPdf: " + contenido);
  }

  public void exportarTextoPlano() {
    System.out.println("ExportarTextoPlano: " + contenido);
  }

  public void exportarXls() {
    System.out.println("ExportarXls: " + contenido);
  }
}

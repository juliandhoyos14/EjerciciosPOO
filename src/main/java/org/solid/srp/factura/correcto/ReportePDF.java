package org.solid.srp.factura.correcto;

public class ReportePDF implements Reporte {

  @Override
  public void exportar(Factura factura) {
    System.out.println("Exportando reporte a PDF: " + factura.getContenido());
  }
}

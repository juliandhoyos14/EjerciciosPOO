package org.solid.srp.factura.correcto;

public class ReporteXLS implements Reporte {

  @Override
  public void exportar(Factura factura) {
    System.out.println("Exportando reporte a XLS: " + factura.getContenido());
  }
}

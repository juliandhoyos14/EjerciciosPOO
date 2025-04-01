package org.solid.srp.factura.correcto;

public class ReporteTextoPlano implements Reporte {

  @Override
  public void exportar(Factura factura) {
    System.out.println("Exportando reporte a texto plano: " + factura.getContenido());
  }
}

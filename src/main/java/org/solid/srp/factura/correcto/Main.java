package org.solid.srp.factura.correcto;

public class Main {

  public static void main(String[] args) {
    Factura factura = new Factura("Contenido de la factura");

    Reporte reportePDF = new ReportePDF();
    reportePDF.exportar(factura);
    Reporte reporteXLS = new ReporteXLS();
    reporteXLS.exportar(factura);
    Reporte reporteTextoPlano = new ReporteTextoPlano();
    reporteTextoPlano.exportar(factura);

    Impresora impresora = new Impresora();
    impresora.imprimir(factura);
  }
}

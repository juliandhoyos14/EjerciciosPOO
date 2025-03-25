package org.grasp.creator.asociacion;

public class ServicioReporte {

  public Reporte generarReporte(float ventasTotales, float ventasMes) {
    Reporte reporte = new Reporte();

    reporte.agregarContenido("Reporte de ventas\n");
    reporte.agregarContenido("Ventas totales: " + ventasTotales + "\n");
    reporte.agregarContenido("Ventas del mes: " + ventasMes + "\n");
    return reporte;
  }
}

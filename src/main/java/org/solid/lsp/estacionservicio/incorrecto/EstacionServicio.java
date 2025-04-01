package org.solid.lsp.estacionservicio.incorrecto;

public class EstacionServicio {

  public void reabastecer(Vehiculo vehiculo, double porcentajeTanque, double porcentajeBateria) throws UnsupportedOperationException {

    if (vehiculo instanceof VehiculoCombustion) {
      vehiculo.llenarTanque(porcentajeTanque);
    } else if (vehiculo instanceof VehiculoElectrico) {
      vehiculo.recargarBateria(porcentajeBateria);
    } else if (vehiculo instanceof VehiculoHibrido) {
      vehiculo.llenarTanque(porcentajeTanque);
      vehiculo.recargarBateria(porcentajeBateria);
    } else {
      throw new UnsupportedOperationException("Tipo de vehículo no soportado");
    }
  }
}

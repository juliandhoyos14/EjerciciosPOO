package org.solid.lsp.estacionservicio.incorrecto;

public class VehiculoHibrido extends Vehiculo {

  @Override
  public void llenarTanque(double porcentajeTanque) {
    super.porcentajeTanque = porcentajeTanque;
  }

  @Override
  public void recargarBateria(double porcentajeBateria) {
    super.porcetajeBateria = porcentajeBateria;
  }
}

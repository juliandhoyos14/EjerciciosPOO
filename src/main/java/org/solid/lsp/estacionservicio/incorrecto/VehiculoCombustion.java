package org.solid.lsp.estacionservicio.incorrecto;

public class VehiculoCombustion extends Vehiculo {


  @Override
  public void llenarTanque(double porcentajeTanque) {
    super.porcentajeTanque = porcentajeTanque;
  }

  @Override
  public void recargarBateria(double porcentajeBateria) {
    throw new UnsupportedOperationException("Un vehículo de combustión no puede recargar batería");
  }
}

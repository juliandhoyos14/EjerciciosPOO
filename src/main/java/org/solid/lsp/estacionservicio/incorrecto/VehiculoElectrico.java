package org.solid.lsp.estacionservicio.incorrecto;

public class VehiculoElectrico extends Vehiculo {

  @Override
  public void llenarTanque(double porcentajeTanque) {
    throw new UnsupportedOperationException("Un vehículo eléctrico no puede llenar tanque");
  }

  @Override
  public void recargarBateria(double porcentajeBateria) {
    super.porcetajeBateria = porcentajeBateria;
  }
}

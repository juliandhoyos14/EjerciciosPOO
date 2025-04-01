package org.solid.lsp.estacionservicio.correcto;

public class VehiculoElectrico extends Vehiculo {

  private double porcentajeBateria;


  @Override
  public void abastecer(Solicitud solicitud) {
    this.porcentajeBateria = solicitud.getPorcentajeBateria();
  }
}

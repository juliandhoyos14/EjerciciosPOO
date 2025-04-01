package org.solid.lsp.estacionservicio.correcto;

public class VehiculoCombustion extends Vehiculo {

  private double porcentajeTanque;

  @Override
  public void abastecer(Solicitud solicitud) {
    this.porcentajeTanque = solicitud.getPorcentajeTanque();
  }
}

package org.solid.lsp.estacionservicio.correcto;

public class VehiculoHibrido extends Vehiculo {

  private double porcentajeBateria;
  private double porcentajeTanque;


  @Override
  public void abastecer(Solicitud solicitud) {
    this.porcentajeBateria = solicitud.getPorcentajeBateria();
    this.porcentajeTanque = solicitud.getPorcentajeTanque();
  }
}

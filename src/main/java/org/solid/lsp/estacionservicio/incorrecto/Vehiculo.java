package org.solid.lsp.estacionservicio.incorrecto;

public abstract class Vehiculo {

  protected double porcentajeTanque;
  protected double porcetajeBateria;

  public abstract void llenarTanque(double porcentajeTanque);

  public abstract void recargarBateria(double porcentajeBateria);

  public double getPorcentajeTanque() {
    return porcentajeTanque;
  }

  public double getPorcetajeBateria() {
    return porcetajeBateria;
  }
}

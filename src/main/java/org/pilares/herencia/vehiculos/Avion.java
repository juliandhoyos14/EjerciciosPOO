package org.pilares.herencia.vehiculos;

public class Avion extends Vehiculo implements Volador {

  private int numeroMotores;

  public Avion(String marca, int modelo, double velocidadMaxima, int numeroMotores) {
    super(marca, modelo, velocidadMaxima);
    this.numeroMotores = numeroMotores;
  }

  @Override
  public void volar() {
    System.out.println("Volando...");
  }

  public int getNumeroMotores() {
    return numeroMotores;
  }
}

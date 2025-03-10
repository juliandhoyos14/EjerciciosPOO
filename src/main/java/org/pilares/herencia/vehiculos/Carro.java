package org.pilares.herencia.vehiculos;

public class Carro extends Vehiculo {

  private int numeroLlantas;

  public Carro(String marca, int modelo, double velocidadMaxima, int numeroLlantas) {
    super(marca, modelo, velocidadMaxima);
    this.numeroLlantas = numeroLlantas;
  }

  public int getNumeroLlantas() {
    return numeroLlantas;
  }
}

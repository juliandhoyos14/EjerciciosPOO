package org.grasp.controller;

public abstract class Habitacion {

  private int numero;
  private double precio;

  public Habitacion(int numero, double precio) {
    this.numero = numero;
    this.precio = precio;
  }

  public int getNumero() {
    return numero;
  }

  public double getPrecio() {
    return precio;
  }
}

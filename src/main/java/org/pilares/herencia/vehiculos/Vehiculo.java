package org.pilares.herencia.vehiculos;

public class Vehiculo {

  protected String marca;
  protected int modelo;
  protected double velocidadMaxima;

  public Vehiculo(String marca, int modelo, double velocidadMaxima) {
      this.marca = marca;
      this.modelo = modelo;
      this.velocidadMaxima = velocidadMaxima;
  }

  protected void acelerar() {
    System.out.println("Acelerando...");
  }
}

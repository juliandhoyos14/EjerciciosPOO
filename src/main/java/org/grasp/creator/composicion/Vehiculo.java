package org.grasp.creator.composicion;

public class Vehiculo {

  private String modelo;
  private String marca;
  private String placa;
  private Motor motor;

  public Vehiculo(String modelo, String marca, String placa, int potencia, String tipo) {
    this.modelo = modelo;
    this.marca = marca;
    this.placa = placa;
    this.motor = new Motor(potencia, tipo);
  }
}

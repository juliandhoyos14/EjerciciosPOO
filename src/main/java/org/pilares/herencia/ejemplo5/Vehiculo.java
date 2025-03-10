package org.pilares.herencia.ejemplo5;

public class Vehiculo {

  protected String marca;
  protected String modelo;
  protected int velocidadMaxima;
  protected int velocidadActual;

  public Vehiculo(String marca, String modelo, int velocidadMaxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadMaxima = velocidadMaxima;
    this.velocidadActual = 0;
  }

  public void acelerar(int velocidad) {
    if (this.velocidadActual + velocidad > this.velocidadMaxima) {
      this.velocidadActual = this.velocidadMaxima;
    } else {
      this.velocidadActual += velocidad;
    }
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getVelocidadMaxima() {
    return velocidadMaxima;
  }

  public void setVelocidadMaxima(int velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
  }

  public int getVelocidadActual() {
    return velocidadActual;
  }
}

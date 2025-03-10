package org.pilares.herencia.ejemplo5;

public class Carro extends Vehiculo {

  private int numeroPuertas;
  private String tipo;

  public Carro(String marca, String modelo, int velocidadMaxima, int numeroPuertas, String tipo) {
    super(marca, modelo, velocidadMaxima);
    this.numeroPuertas = numeroPuertas;
    this.tipo = tipo;
  }

  public void activarLimpiaBrisas() {
    System.out.println("Limpia brisas activado");
  }

  public int getNumeroPuertas() {
    return numeroPuertas;
  }

  public void setNumeroPuertas(int numeroPuertas) {
    this.numeroPuertas = numeroPuertas;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}

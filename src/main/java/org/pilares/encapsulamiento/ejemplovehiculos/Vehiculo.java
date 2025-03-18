package org.pilares.encapsulamiento.ejemplovehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

  private String marca;
  private String modelo;
  private int anio;
  private double kilometraje;

  public Vehiculo(String marca, String modelo, int anio, double kilometraje) {
    this.marca = marca;
    this.modelo = modelo;
    setAnio(anio);
    setKilometraje(kilometraje);
  }

  public void setAnio(int anio) {
    if (anio < 0 || anio > 2025) {
      throw new IllegalArgumentException("El año debe ser mayor a 0 y menor o igual a 2025");
    }
    this.anio = anio;
  }

  public void setKilometraje(double kilometraje) {
    if (kilometraje < 0) {
      throw new IllegalArgumentException("El kilometraje no puede ser negativo");
    }
    this.kilometraje = kilometraje;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAnio() {
    return anio;
  }

  public double getKilometraje() {
    return kilometraje;
  }

  public static List<Vehiculo> findVehiculoByMarca(String marca, List<Vehiculo> vehiculos) {
    List<Vehiculo> resultado = new ArrayList<>();
    for (Vehiculo vehiculo : vehiculos) {
      if (vehiculo.getMarca().equals(marca)) {
        resultado.add(vehiculo);
      }
    }
    return resultado;
  }

  @Override
  public String toString() {
    return "Vehiculo{" +
        "marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", anio=" + anio +
        ", kilometraje=" + kilometraje +
        '}';
  }

  public void actualizarKilometraje(double kilometraje) {
    if (kilometraje < 0) {
      throw new IllegalArgumentException("El kilometraje no puede ser negativo");
    }
    this.kilometraje += kilometraje;
  }
}

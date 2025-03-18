package org.pilares.encapsulamiento.ejemplovehiculos;

public class Camion extends Vehiculo {

  private int capacidadCarga;

  public Camion(String marca, String modelo, int anio, double kilometraje, int capacidadCarga) {
    super(marca, modelo, anio, kilometraje);
    setCapacidadCarga(capacidadCarga);
  }

  public void setCapacidadCarga(int capacidadCarga) {
    if (capacidadCarga < 0) {
      throw new IllegalArgumentException("La capacidad de carga no puede ser negativa");
    }
    this.capacidadCarga = capacidadCarga;
  }

  @Override
  public String toString() {
    return "Camion {" +
        "marca=" + getMarca() +
        ", modelo=" + getModelo() +
        ", anio=" + getAnio() +
        ", kilometraje=" + getKilometraje() +
        ", capacidadCarga=" + capacidadCarga +
        '}';
  }
}

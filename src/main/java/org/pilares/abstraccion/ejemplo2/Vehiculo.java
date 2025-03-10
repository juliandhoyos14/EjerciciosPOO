package org.pilares.abstraccion.ejemplo2;

public abstract class Vehiculo {

  protected int ruedas;
  protected int velocidad;

  public Vehiculo(int ruedas) {
    this.ruedas = ruedas;
    this.velocidad = 0;  // Inicialmente detenido
  }

  public void acelerar(int incremento) {
    velocidad += incremento;
    System.out.println("Velocidad: " + velocidad + " km/h");
  }

  // Metodo abstracto que cada vehículo implementará a su manera
  public abstract void moverse();
}

package org.pilares.abstraccion.ejemplo2;

public class Auto extends Vehiculo {

  public Auto() {
    super(4); // Un coche tiene 4 ruedas
  }

  @Override
  public void moverse() {
    System.out.println("El coche se mueve por carretera.");
  }
}

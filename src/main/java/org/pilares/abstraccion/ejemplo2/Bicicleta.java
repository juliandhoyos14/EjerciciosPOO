package org.pilares.abstraccion.ejemplo2;

public class Bicicleta extends Vehiculo {

  public Bicicleta() {
    super(2); // Una bicicleta tiene 2 ruedas
  }

  @Override
  public void moverse() {
    System.out.println("La bicicleta se mueve por la ciclovia.");
  }
}

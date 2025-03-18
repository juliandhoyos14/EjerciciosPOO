package org.pilares.abstraccion.ejemplo3;

public class Avion implements PuedeVolar {


  @Override
  public void volar() {
    System.out.println("El avión despega y vuela a gran velocidad.");
  }
}

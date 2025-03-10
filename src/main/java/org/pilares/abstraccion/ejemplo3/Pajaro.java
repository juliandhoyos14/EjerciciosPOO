package org.pilares.abstraccion.ejemplo3;

public class Pajaro implements PuedeVolar {

  @Override
  public void volar() {
    System.out.println("El pájaro bate sus alas para volar.");
    despegar();

    double pi = Math.PI;
  }
}

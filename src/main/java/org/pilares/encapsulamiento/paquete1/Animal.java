package org.pilares.encapsulamiento.paquete1;

public abstract class Animal {

  private String nombre;

  abstract String hacerSonido();

  public void comer() {
    System.out.println("El animal está comiendo");
  }
}

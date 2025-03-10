package org.pilares.abstraccion.ejemplo3;

// Interfaz que define el comportamiento común de volar
public interface PuedeVolar {

  void volar();

  default void despegar() {
    System.out.println("Despegando...");
  }
}

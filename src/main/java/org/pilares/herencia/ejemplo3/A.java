package org.pilares.herencia.ejemplo3;

public interface A {

  default void mostrar() {
    System.out.println("A");
  }
}

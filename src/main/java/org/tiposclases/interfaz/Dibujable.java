package org.tiposclases.interfaz;

public interface Dibujable {

  void dibujar();

  void borrar();

  default void mover() {
      System.out.println("Mover el objeto");
  }

  static void imprimir() {
      System.out.println("Imprimir el objeto");
  }
}

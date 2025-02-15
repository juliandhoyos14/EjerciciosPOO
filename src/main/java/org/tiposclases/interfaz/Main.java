package org.tiposclases.interfaz;

public class Main {

  public static void main(String[] args) {
    // Crear un objeto de la clase Circulo
    Circulo circulo = new Circulo(5.0);

    // Llamar a los métodos de la interfaz Dibujable
    circulo.dibujar();
    circulo.borrar();
    circulo.mover();

    // Llamar al método estático de la interfaz Dibujable
    Dibujable.imprimir();
  }
}

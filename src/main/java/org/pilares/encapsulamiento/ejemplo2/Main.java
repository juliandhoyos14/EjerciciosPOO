package org.pilares.encapsulamiento.ejemplo2;

public class Main {

  public static void main(String[] args) {
    Persona p = new Persona("Carlos", 25);
    System.out.println(p.getNombre() + " tiene " + p.getEdad() + " años.");

    p.setEdad(-5);  // Intento de asignar edad negativa
    System.out.println("Edad después de intento de cambio: " + p.getEdad());
  }
}

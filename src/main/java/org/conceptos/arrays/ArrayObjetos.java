package org.conceptos.arrays;

import org.example.ejercicio1.Persona;

public class ArrayObjetos {

  public static void main(String[] args) {
    Persona[] personas = new Persona[3];

    personas[0] = new Persona("Carlos", 28);
    personas[1] = new Persona("Ana", 24);
    personas[2] = new Persona("Luis", 35);

    System.out.println(personas[0]);

    System.out.println("Información de Personas:");
    for (Persona p : personas) {
      p.mostrarInformacion();
    }
  }
}

package org.conceptos.arrays;

public class ArrayNumeros {

  public static void main(String[] args) {
    int[] edades = {18, 22, 30, 45, 60};

    System.out.println("Listado de edades:");
    for (int i = 0; i < edades.length; i++) {
      System.out.println("Edad " + (i + 1) + ": " + edades[i]);
    }

    System.out.println("Usando for-each:");
    for (int edad : edades) {
      System.out.println("Edad: " + edad);
    }
  }
}

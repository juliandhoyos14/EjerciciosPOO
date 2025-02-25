package org.conceptos.collections;

import java.util.Hashtable;

public class HashMapExample {

  public static void main(String[] args) {
    Hashtable<Integer, String> tabla = new Hashtable<>();
    tabla.put(1, "Rojo");
    tabla.put(2, "Verde");
    tabla.put(3, "Azul");

    System.out.println("Hashtable: " + tabla);
    System.out.println("Valor asociado a la clave 2: " + tabla.get(2));

    tabla.remove(1);
    System.out.println("Después de eliminar la clave 1: " + tabla);
  }
}

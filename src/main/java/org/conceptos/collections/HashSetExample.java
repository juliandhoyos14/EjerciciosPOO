package org.conceptos.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

  public static void main(String[] args) {
    Set<String> paises = new HashSet<>();
    paises.add("México");
    paises.add("Colombia");
    paises.add("Argentina");
    paises.add("México"); // Duplicado, no se agregará

    System.out.println("Conjunto de países: " + paises);
    System.out.println("¿Contiene Colombia? " + paises.contains("Colombia"));
  }
}

package org.conceptos.collections;

import java.util.TreeSet;

public class TreeSetExample {

  public static void main(String[] args) {
    TreeSet<Integer> numerosOrdenados = new TreeSet<>();
    numerosOrdenados.add(50);
    numerosOrdenados.add(10);
    numerosOrdenados.add(30);
    numerosOrdenados.add(20);
    numerosOrdenados.add(10);

    System.out.println("Conjunto ordenado: " + numerosOrdenados);
    System.out.println("Primer elemento: " + numerosOrdenados.first());
    System.out.println("Último elemento: " + numerosOrdenados.last());
  }
}

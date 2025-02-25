package org.conceptos.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

  public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();
    nombres.add("Juan");
    nombres.add("María");
    nombres.add("Carlos");
    nombres.add("Pedro");

    System.out.println("Lista de nombres: " + nombres);
    System.out.println("Elemento en la posición 1: " + nombres.get(1));

    nombres.remove("María");
    System.out.println("Lista después de eliminar a María: " + nombres);

    //Recorrer el ArrayList con Iterator
    System.out.println("Recorriendo la lista con Iterator:");
    Iterator<String> iter = nombres.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }

    //Recorrer el ArrayList con for-each
    System.out.println("Recorriendo la lista con for-each:");
    for (String nombre : nombres) {
      System.out.println(nombre);
    }

    //Recorrer el ArrayList con for
    System.out.println("Recorriendo la lista con for:");
    for (int i = 0; i < nombres.size(); i++) {
      System.out.println(nombres.get(i));
    }

    //Recorrer el ArrayList con stream
    System.out.println("Recorriendo la lista con stream:");
    nombres.stream().forEach(System.out::println);

  }

}

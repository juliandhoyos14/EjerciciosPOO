package org.conceptos.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

  public static void main(String[] args) {
    List<Integer> numeros = new LinkedList<>();
    numeros.add(10);
    numeros.add(20);
    numeros.add(20);
    numeros.addFirst(5); // Agrega al inicio
    numeros.addLast(30); // Agrega al final

    System.out.println("Lista enlazada: " + numeros);

    numeros.removeFirst(); // Elimina el primer elemento
    System.out.println("Después de eliminar el primer elemento: " + numeros);
  }
}

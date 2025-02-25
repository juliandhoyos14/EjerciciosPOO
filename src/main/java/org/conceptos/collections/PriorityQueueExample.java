package org.conceptos.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

  public static void main(String[] args) {
    PriorityQueue<Integer> cola = new PriorityQueue<>();
    cola.add(30);
    cola.add(10);
    cola.add(20);

    System.out.println("Cola de prioridad: " + cola);
    System.out.println("Elemento con mayor prioridad (mínimo): " + cola.poll());
    System.out.println("Cola después de eliminar el elemento de mayor prioridad: " + cola);
  }
}

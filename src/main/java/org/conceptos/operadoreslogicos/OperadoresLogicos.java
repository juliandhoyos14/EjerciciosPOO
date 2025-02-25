package org.conceptos.operadoreslogicos;

public class OperadoresLogicos {

  public static void main(String[] args) {
    int a = 8;
    int b = 3;

    boolean condicion1 = (a > 5);
    boolean condicion2 = (b > 10);

    System.out.println("condicion1: " + condicion1); // true
    System.out.println("condicion2: " + condicion2); // true

    // && (AND)
    System.out.println("condicion1 && condicion2: " + (condicion1 && condicion2)); // true

    // || (OR)
    System.out.println("condicion1 || condicion2: " + (condicion1 || condicion2)); // true

    // ! (NOT)
    System.out.println("!condicion1: " + (!condicion1)); // false
  }
}

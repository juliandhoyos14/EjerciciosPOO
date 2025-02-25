package org.conceptos.estructurascontrol.ciclofor;

public class EjemplosFor {

  public static void main(String[] args) {

    System.out.println("Incremento de 1 en 1");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Iteración " + i);
    }

    System.out.println("Decremento de 1 en 1");
    for (int i = 5; i >= 1; i--) {
      System.out.println("Valor: " + i);
    }

    System.out.println("Incremento de 2 en 2");
    for (int i = 0; i <= 10; i += 2) {
      System.out.println("Valor: " + i);
    }

    System.out.println("Recorrer un array con for");
    int[] numeros = {10, 20, 30, 40};
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Elemento en posición " + i + ": " + numeros[i]);
    }

    System.out.println("Recorrer un array con for-each");
    for (int numero : numeros) {
      System.out.println("Número: " + numero);
    }
  }
}

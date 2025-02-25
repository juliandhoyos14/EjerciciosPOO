package org.conceptos.estructurascontrol.ciclodowhile;

import java.util.Scanner;

public class EjemploDoWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;

    do {
      System.out.print("Introduce un número positivo: ");
      numero = scanner.nextInt();
    } while (numero < 0);

    System.out.println("Número aceptado: " + numero);
  }
}

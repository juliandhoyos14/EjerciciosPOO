package org.conceptos.estructurascontrol.ciclowhile;

import java.util.Scanner;

public class EjemploWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un número positivo: ");
    numero = scanner.nextInt();

    while (numero <= 0) {
      System.out.print("Número inválido. Introduce un número positivo: ");
      numero = scanner.nextInt();
    }

    System.out.println("Número aceptado: " + numero);
  }
}

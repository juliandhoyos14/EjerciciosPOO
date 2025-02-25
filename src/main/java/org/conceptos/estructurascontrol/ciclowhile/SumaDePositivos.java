package org.conceptos.estructurascontrol.ciclowhile;

import java.util.Scanner;

public class SumaDePositivos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;

    System.out.print("Introduce un número (negativo para salir): ");
    int numero = scanner.nextInt();

    while (numero >= 0) {
      suma += numero;

      System.out.print("Introduce un número (negativo para salir): ");
      numero = scanner.nextInt();
    }

    System.out.println("Suma total: " + suma);
  }
}

package org.conceptos.estructurascontrol.ciclodowhile;

import java.util.Scanner;

public class MenuDoWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("---- MENÚ ----");
      System.out.println("1. Opción 1");
      System.out.println("2. Opción 2");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1 -> System.out.println("Elegiste Opción 1");
        case 2 -> System.out.println("Elegiste Opción 2");
        case 3 -> System.out.println("Saliendo...");
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 3);
  }
}

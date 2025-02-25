package org.conceptos.estructurascontrol.ifelse;

import java.util.Scanner;

public class EjemploEdad {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Proporciona tu edad:");
    int edad = scanner.nextInt();
    if (edad >= 18) {
      System.out.println("Eres mayor de edad.");
    } else {
      System.out.println("Eres menor de edad.");
    }
    System.out.println("Fin del programa.");
  }
}

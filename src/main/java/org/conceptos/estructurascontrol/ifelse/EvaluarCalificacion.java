package org.conceptos.estructurascontrol.ifelse;

import java.util.Scanner;

public class EvaluarCalificacion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese una calificación (0 a 5): ");

    // Validar que el valor ingresado sea numérico
    if (scanner.hasNextDouble()) {
      double calificacion = scanner.nextDouble();

      if (calificacion >= 0 && calificacion <= 5) {
        if (calificacion >= 4.5 && calificacion <= 5.0) {
          System.out.println("Excelente");
        } else if (calificacion >= 4.0 && calificacion < 4.5) {
          System.out.println("Bueno");
        } else if (calificacion >= 3.0 && calificacion < 4.0) {
          System.out.println("Aprobado");
        } else {
          System.out.println("Reprobado");
        }
      } else {
        System.out.println("Valor ingresado no válido.");
      }
    } else {
      System.out.println("Valor ingresado no válido.");
    }

    scanner.close();
  }
}

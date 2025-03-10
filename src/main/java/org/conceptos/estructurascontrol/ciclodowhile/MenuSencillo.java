package org.conceptos.estructurascontrol.ciclodowhile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuSencillo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("------ MENÚ ------");
      System.out.println("1. Saludar");
      System.out.println("2. Mostrar fecha y hora actual");
      System.out.println("3. Salir");
      System.out.print("Seleccione una opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("¡Hola, bienvenido!");
          break;
        case 2:
          LocalDateTime fechaHora = LocalDateTime.now();
          DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
          System.out.println("Fecha y hora actual: " + fechaHora.format(formato));
          break;
        case 3:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida. Intente de nuevo.");
          break;
      }
      System.out.println(); // Línea en blanco para separar cada iteración
    } while (opcion != 3);

    scanner.close();
  }
}

package org.conceptos;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba2 {

  public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("\nMenú:");
      System.out.println("1. Agregar un nombre");
      System.out.println("2. Eliminar un nombre");
      System.out.println("3. Mostrar la lista completa");
      System.out.println("4. Buscar un nombre");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opción: ");

      while (!scanner.hasNextInt()) {
        System.out.println("Por favor, ingrese un número válido.");
        scanner.next();
      }
      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          System.out.print("Ingrese el nombre a agregar: ");
          String nombreAgregar = scanner.nextLine();
          nombres.add(nombreAgregar);
          System.out.println("Nombre agregado correctamente.");
          break;
        case 2:
          System.out.print("Ingrese el nombre a eliminar: ");
          String nombreEliminar = scanner.nextLine();
          if (nombres.remove(nombreEliminar)) {
            System.out.println("Nombre eliminado correctamente.");
          } else {
            System.out.println("El nombre no se encontró en la lista.");
          }
          break;
        case 3:
          System.out.println("Lista de nombres:");
          if (nombres.isEmpty()) {
            System.out.println("La lista está vacía.");
          } else {
            for (String nombre : nombres) {
              System.out.println("- " + nombre);
            }
          }
          break;
        case 4:
          System.out.print("Ingrese el nombre a buscar: ");
          String nombreBuscar = scanner.nextLine();
          if (nombres.contains(nombreBuscar)) {
            System.out.println("El nombre está en la lista.");
          } else {
            System.out.println("El nombre no se encontró en la lista.");
          }
          break;
        case 5:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida. Intente de nuevo.");
      }
    } while (opcion != 5);

    scanner.close();
  }
}

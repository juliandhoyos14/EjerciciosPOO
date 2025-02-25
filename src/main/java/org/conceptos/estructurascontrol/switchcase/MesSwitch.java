package org.conceptos.estructurascontrol.switchcase;

import java.util.Scanner;

public class MesSwitch {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un número de mes: ");
    int mes = 0;
    if (scanner.hasNextInt()) {
      mes = scanner.nextInt();
      String nombreMes = switch (mes) {
        case 1 -> "Enero";
        case 2 -> "Febrero";
        case 3 -> "Marzo";
        case 4 -> "Abril";
        case 5 -> "Mayo";
        case 6 -> "Junio";
        case 7 -> "Julio";
        case 8 -> "Agosto";
        case 9 -> "Septiembre";
        case 10 -> "Octubre";
        case 11 -> "Noviembre";
        case 12 -> "Diciembre";
        default -> "Mes no válido";
      };
      System.out.println(nombreMes);
    } else {
      System.out.println("El valor introducido no es un número.");
    }
  }
}

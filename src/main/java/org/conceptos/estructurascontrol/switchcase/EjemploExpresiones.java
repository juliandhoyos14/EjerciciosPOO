package org.conceptos.estructurascontrol.switchcase;

public class EjemploExpresiones {

  public static void main(String[] args) {
    int dia = 4;

    String nombreDia = switch (dia) {
      case 1 -> "Lunes";
      case 2 -> "Martes";
      case 3 -> "Miércoles";
      case 4, 5 -> "Jueves o Viernes"; // Puedes agrupar casos
      default -> "Día no válido";
    };

    System.out.println(nombreDia);
  }
}

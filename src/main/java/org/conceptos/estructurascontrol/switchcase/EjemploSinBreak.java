package org.conceptos.estructurascontrol.switchcase;

public class EjemploSinBreak {

  public static void main(String[] args) {
    int dia = 3;

    switch (dia) {
      case 1:
        System.out.println("Lunes");
      case 2:
        System.out.println("Martes");
      case 3:
        System.out.println("Miércoles");
      case 4:
        System.out.println("Jueves");
      default:
        System.out.println("Día no válido");
    }
  }
}

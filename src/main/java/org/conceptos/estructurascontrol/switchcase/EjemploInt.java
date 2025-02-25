package org.conceptos.estructurascontrol.switchcase;

public class EjemploInt {

  public static void main(String[] args) {
    int dia = 2;

    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      default:
        System.out.println("Día no válido");
    }
  }
}

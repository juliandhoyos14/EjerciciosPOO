package org.conceptos.estructurascontrol.switchcase;

public class EjemploEnum {

  public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
  }

  public static void main(String[] args) {
    DiaSemana dia = DiaSemana.MIERCOLES;

    switch (dia) {
      case LUNES:
        System.out.println("¡Ánimo, es lunes!");
        break;
      case MARTES:
        System.out.println("Es martes, vamos con todo.");
        break;
      case MIERCOLES:
        System.out.println("Miércoles, mitad de semana.");
        break;
      case JUEVES:
        System.out.println("Jueves, casi viernes.");
        break;
      case VIERNES:
        System.out.println("Viernes, por fin!");
        break;
      case SABADO:
      case DOMINGO:
        System.out.println("Fin de semana, a descansar.");
        break;
      default:
        System.out.println("Día no reconocido.");
    }
  }
}

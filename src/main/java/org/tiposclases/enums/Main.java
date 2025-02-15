package org.tiposclases.enums;

public class Main {

  public static void main(String[] args) {
    DiasSemana hoy = DiasSemana.DOMINGO;
    System.out.println("Hoy es: " + hoy);

    // Recorrer todos los valores del enum
    for (DiasSemana dia : DiasSemana.values()) {
      System.out.println(dia);
    }
  }
}

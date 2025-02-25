package org.conceptos.estructurascontrol.ifelse;

public class EjemploLicencia {

  public static void main(String[] args) {
    int edad = 25;
    boolean tieneLicencia = true;

    if (edad >= 18) {
      if (tieneLicencia) {
        System.out.println("Puede conducir.");
      } else {
        System.out.println("Necesita licencia.");
      }
    } else {
      System.out.println("Es menor de edad.");
    }
  }
}

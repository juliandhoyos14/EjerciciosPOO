package org.conceptos.estructurascontrol.switchcase;

public class EjemploString {

  public static void main(String[] args) {
    String fruta = "manzana";

    switch (fruta) {
      case "manzana":
        System.out.println("Es una manzana");
        break;
      case "pera":
        System.out.println("Es una pera");
        break;
      default:
        System.out.println("Fruta no reconocida");
    }
  }
}

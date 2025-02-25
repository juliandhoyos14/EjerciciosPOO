package org.conceptos.estructurascontrol.switchcase;

public class EjemploChar {

  public static void main(String[] args) {
    char letra = 'a';

    switch (letra) {
      case 'a':
        System.out.println("Es la letra a");
        break;
      case 'b':
        System.out.println("Es la letra b");
        break;
      default:
        System.out.println("Letra no reconocida");
    }
  }
}

package org.pilares.abstraccion.ejemplo3;

public class Main {

  public static void main(String[] args) {
    PuedeVolar pajaro = new Pajaro();
    PuedeVolar avion = new Avion();

    pajaro.volar();
    avion.volar();
  }
}

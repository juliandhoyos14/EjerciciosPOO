package org.pilares.herencia.ejemplo4;

public class Pato implements Volador, Nadador {

  @Override
  public void volar() {
    System.out.println("El pato está volando");
  }

  @Override
  public void nadar() {

  }
}

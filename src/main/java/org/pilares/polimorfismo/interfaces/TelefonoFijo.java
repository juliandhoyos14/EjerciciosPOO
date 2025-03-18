package org.pilares.polimorfismo.interfaces;

public class TelefonoFijo implements Comunicador {

  @Override
  public void llamar(String numero) {
    System.out.println("Marcando número " + numero + " desde un teléfono fijo...");
  }
}

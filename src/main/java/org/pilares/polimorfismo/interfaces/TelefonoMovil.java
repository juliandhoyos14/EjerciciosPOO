package org.pilares.polimorfismo.interfaces;

public class TelefonoMovil implements Comunicador {

  @Override
  public void llamar(String numero) {
    System.out.println("Llamando al número " + numero + " desde un teléfono móvil usando la red celular...");
  }
}

package org.tiposclases.concreta;

public class Coche {

  private String marca;
  private String modelo;

  public Coche() {
    
  }

  public Coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  /**
   * Método para arrancar el coche
   */
  public void arrancar() {
    System.out.println("El coche está arrancando.");
  }
}

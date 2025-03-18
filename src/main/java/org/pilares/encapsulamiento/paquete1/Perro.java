package org.pilares.encapsulamiento.paquete1;

public class Perro extends Animal {

  public Perro() {
    super();
  }

  @Override
  public String hacerSonido() {
    return "Guau guau";
  }

  @Override
  public void comer() {
      System.out.println("El perro está comiendo");
  }

  public void ladrar() {
    System.out.println("El perro está ladrando");
  }
}

package org.tiposclases.abstracta;

public class Perro extends Animal {

  @Override
  public void hacerSonido() {
    System.out.println("El perro ladra");
  }

  @Override
  public void dormir() {
    System.out.println("El perro está durmiendo en su cama");
  }
}

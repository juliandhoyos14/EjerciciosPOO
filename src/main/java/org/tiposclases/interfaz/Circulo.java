package org.tiposclases.interfaz;

public class Circulo implements Dibujable {

  private double radio;

  public Circulo(double radio) {
      this.radio = radio;
  }

  @Override
  public void dibujar() {
      System.out.println("Dibujar el círculo");
  }

  @Override
  public void borrar() {
      System.out.println("Borrar el círculo");
  }

  /*@Override
  public void mover() {
      System.out.println("Mover el círculo");
  }*/
}

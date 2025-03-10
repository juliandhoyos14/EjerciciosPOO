package org.pilares.abstraccion.ejemplo2;

public class Main {

  public static void main(String[] args) {
    Vehiculo miAuto = new Auto();
    miAuto.moverse();
    miAuto.acelerar(20);

    System.out.println("---------------------");

    Vehiculo miBici = new Bicicleta();
    miBici.moverse();
    miBici.acelerar(10);
  }
}

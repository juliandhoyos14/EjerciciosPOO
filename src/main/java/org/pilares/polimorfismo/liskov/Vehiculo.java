package org.pilares.polimorfismo.liskov;

public class Vehiculo {

  public void encenderMotor() {
    System.out.println("El motor está encendido");
  }
}

class Bicicleta extends Vehiculo {
  @Override
  public void encenderMotor() {
    throw new UnsupportedOperationException("Las bicicletas no tienen motor");
  }
}

/*
 *   Problema: Si en un sistema se espera que todos los Vehiculo tengan encenderMotor(),
 *   al usar una Bicicleta, el programa fallará.
 */
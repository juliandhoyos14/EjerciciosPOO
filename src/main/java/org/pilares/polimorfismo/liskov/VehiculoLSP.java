package org.pilares.polimorfismo.liskov;

public abstract class VehiculoLSP {

  public abstract void mover();
}

class CocheLSP extends VehiculoLSP {
  @Override
  public void mover() {
    System.out.println("El coche avanza usando su motor");
  }
}

class BicicletaLSP extends VehiculoLSP {
  @Override
  public void mover() {
    System.out.println("La bicicleta avanza pedaleando");
  }
}

/*
 *   Ahora ambos Vehiculo tienen el método mover(), respetando LSP.
 */
